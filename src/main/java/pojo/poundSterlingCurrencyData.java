package pojo;

public class poundSterlingCurrencyData {

    private String email;
    private String password;
    private String searchItem;
    private String poundSterlingCurrency;

    public poundSterlingCurrencyData(String _email, String _password, String _searchItem, String _poundSterlingCurrency){

        this.email = _email;
        this.password = _password;
        this.searchItem = _searchItem;
        this.poundSterlingCurrency = _poundSterlingCurrency;
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

    public String getPoundSterlingCurrency(){

        return poundSterlingCurrency;
    }
}

