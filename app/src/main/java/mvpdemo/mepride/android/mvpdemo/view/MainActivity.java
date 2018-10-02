package mvpdemo.mepride.android.mvpdemo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import mvpdemo.mepride.android.mvpdemo.R;
import mvpdemo.mepride.android.mvpdemo.contract.MainActivityContract;
import mvpdemo.mepride.android.mvpdemo.presenter.MainActivityPresenter;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {

    private TextView mTextView;
    private MainActivityContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter = new MainActivityPresenter(this);
    }

    @Override
    public void initView(){
        mTextView = findViewById(R.id.textview);
        mTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.onClick(v);
            }
        });
    }

    @Override
    public void setViewData(String data){
        mTextView.setText(data);
    }
}
