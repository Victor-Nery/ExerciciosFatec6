import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/exercicio7")
public class ServletExercicio7 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletExercicio7() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numero = Integer.parseInt(request.getParameter("numero"));
        int fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        PrintWriter saida = response.getWriter();
        saida.println("<html lang=\"pt-br\">"
                + "<meta charset=\"UTF-8\">"
                + "<head><title>Fatorial</title></head>"
                + "<body><h1>O fatorial de " + numero + " é: " + fatorial + 
                "</h1></body></html>");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
}
