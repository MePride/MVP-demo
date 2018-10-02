package mvpdemo.mepride.android.mvpdemo.model;


import mvpdemo.mepride.android.mvpdemo.contract.MainActivityContract;

public class MainActivityModel implements MainActivityContract.Model {

    @Override
    public String getData(){

        return "Hello World";
        
    }
}
