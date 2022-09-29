public class AutorizationSuccesPOJO {

    public String token_type;
    public String value;
    public Integer id;

    public AutorizationSuccesPOJO(String token_type, String value, int id, String display_name) {
        this.token_type = token_type;
        this.value = value;
        this.id = id;

    }

    public String getToken_type() {
        return token_type;
    }

    public String getValue() {
        return value;
    }

    public Integer getId() {
        return id;
    }

}

