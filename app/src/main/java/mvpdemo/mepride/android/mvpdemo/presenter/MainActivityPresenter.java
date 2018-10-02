package mvpdemo.mepride.android.mvpdemo.presenter;


import mvpdemo.mepride.android.mvpdemo.contract.MainActivityContract;
import mvpdemo.mepride.android.mvpdemo.model.MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivityContract.View mView;
    private MainActivityContract.Model mModel;

    public MainActivityPresenter(MainActivityContract.View view){
        mView = view;
        initPresenter();
    }

    public void initPresenter(){
        mModel = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(android.view.View view){
        String data = mModel.getData();
        mView.setViewData(data);
    }
}
