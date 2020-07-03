package pojo;

public class euroCurrencyData {

    private String email;
    private String password;
    private String searchItem;
    private String euroCurrency;

    public euroCurrencyData(String _email, String _password, String _searchItem, String _euroCurrency){

        this.email = _email;
        this.password = _password;
        this.searchItem = _searchItem;
        this.euroCurrency = _euroCurrency;
    }

    public String getEmail(){

        return email;
    }

    public String getPassword(){

        return password;
    }

    public String getSearchItem(){

        return searchItem;
    }

    public String getEuroCurrency(){

        return euroCurrency;
    }
}
