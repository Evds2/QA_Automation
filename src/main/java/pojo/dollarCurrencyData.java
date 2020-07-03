package pojo;

public class dollarCurrencyData {

    private String email;
    private String password;
    private String searchItem;
    private String dollarCurrency;

    public dollarCurrencyData(String _email, String _password, String _searchItem, String _dollarCurrency){

        this.email = _email;
        this.password = _password;
        this.searchItem = _searchItem;
        this.dollarCurrency = _dollarCurrency;
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

    public String getDollarCurrency(){

        return dollarCurrency;
    }
}
