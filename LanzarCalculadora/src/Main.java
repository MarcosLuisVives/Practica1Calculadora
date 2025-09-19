import java.io.*;
public class Main {
    public static void main(String[] args) {
        Runtime rt=Runtime.getRuntime();
        try {
            String[] comando = {"java", "-jar", ".\\Calculadora.jar"};
            Process p =rt.exec(comando);

            InputStream is= p.getInputStream();
            InputStreamReader isr =new InputStreamReader(is);
            BufferedReader br= new BufferedReader(isr);

            OutputStream os=p.getOutputStream();
            OutputStreamWriter osw =new OutputStreamWriter(os);
            BufferedWriter bw = new BufferedWriter(osw);

            String linea= br.readLine();
            System.out.println(linea);
            linea=br.readLine();
            System.out.println(linea);

            bw.write("a");
            bw.newLine();
            bw.flush();
            linea=br.readLine();
            System.out.println(linea);
            bw.write("8");
            bw.newLine();
            bw.flush();
            linea=br.readLine();
            System.out.println(linea);
            bw.write("/" );
            bw.newLine();
            bw.flush();
            linea=br.readLine();
            System.out.println(linea);


        } catch (IOException e) {
            System.out.println("Ha ocurrido un error");
        }
    }
}
