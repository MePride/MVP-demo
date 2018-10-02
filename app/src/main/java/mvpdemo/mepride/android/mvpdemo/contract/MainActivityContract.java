package mvpdemo.mepride.android.mvpdemo.contract;

public interface MainActivityContract {

    interface View{

        void initView();

        void setViewData(String data);
    }

    interface Model{
        String getData();
    }

    interface Presenter{

        void onClick(android.view.View view);
    }
}
