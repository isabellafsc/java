package com.example.exerciciosdearquivos;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class RelatorioDeAlunos {
  public static void main(String[] args) throws ParseException {
    
    Aluno aluno1 = new Aluno(1, "Astolfo", new SimpleDateFormat("dd/MM/yyyy").parse("22/02/2022"), 8.5);
    Aluno aluno2 = new Aluno(2, "Creuza", new SimpleDateFormat("dd/MM/yyyy").parse("05/02/2022"), 7.0);
    Aluno aluno3 = new Aluno(3, "Jefiter", new SimpleDateFormat("dd/MM/yyyy").parse("14/02/2022"), 6.0);
    
    List<Aluno> listaAlunos = new ArrayList<>();
    listaAlunos.add(aluno1);
    listaAlunos.add(aluno2);
    listaAlunos.add(aluno3);

    String caminhoDoRelatorio = Paths.get("src/main/java/com/example/exerciciosdearquivos").toString() + "/arquivo_de_relatorio.csv";
        
    try {
        FileWriter escritorPai = new FileWriter(caminhoDoRelatorio);
        BufferedWriter escritor = new BufferedWriter(escritorPai);

        escritor.write("ID,Nome,Data_de_Matricula,Nota_Final");
        escritor.newLine();

        for (Aluno aluno : listaAlunos) {
          escritor.write(aluno.id.toString() + ",");
          escritor.write(aluno.nome.toString() + ",");
          escritor.write(aluno.dataDeMatricula.toString() + ",");
          escritor.write(aluno.notaFinal.toString()  + "\n");
        }
        escritor.close();

    } catch(IOException exception) {
        System.out.println(exception.getMessage());
    }

  //AVALIANDO ALUNOS

    try {
      Reader leitor = Files.newBufferedReader(Paths.get("src/main/java/com/example/exerciciosdearquivos/arquivo_de_relatorio.csv"));
      CSVReader leitorCSV = new CSVReaderBuilder(leitor).withSkipLines(1).build();

      List<String[]> alunos = leitorCSV.readAll();
      System.out.println("ID,Nome,Data_de_Matricula,Nota_Final");
      for(String[] aluno: alunos){
          System.out.println(aluno[0] + ", " + aluno[1]+ ", " + aluno[2]+ ", " + aluno[3]);
      }
      leitor.close();

    } catch(FileNotFoundException fileNotFoundException) {
        System.out.println(fileNotFoundException.getMessage());
    } catch(IOException ioException){
        System.out.println(ioException.getMessage());
    } catch(Exception e){
        System.out.println(e.getMessage());
    }
  }
}
