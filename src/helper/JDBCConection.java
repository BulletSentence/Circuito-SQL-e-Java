package helper;

public class JDBCConection {

    private static String hostName = "localhost";
    private static String usuario = "postgres";
    private static String senha = "admin";

    private static String prefixo = "jdbc:postgresql://";
    private static String porta = ":5432";
    private static String banco = "/Circuito";

    private static String url = prefixo + hostName + porta + banco;

    public static String getHostName() {
        return hostName;
    }

    public static void setHostName(String hostName) {
        JDBCConection.hostName = hostName;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        JDBCConection.usuario = usuario;
    }

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        JDBCConection.senha = senha;
    }

    public static String getPrefixo() {
        return prefixo;
    }

    public static void setPrefixo(String prefixo) {
        JDBCConection.prefixo = prefixo;
    }

    public static String getPorta() {
        return porta;
    }

    public static void setPorta(String porta) {
        JDBCConection.porta = porta;
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        JDBCConection.banco = banco;
    }

    public static String getUrl() {
        return url;
    }

    public static void setUrl(String url) {
        JDBCConection.url = url;
    }


}

