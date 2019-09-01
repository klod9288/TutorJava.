package srongklod_bangtamruat.p.TutorJava;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class introduction extends Fragment {
    private TextView textView,textView2;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }//Main Method

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        InitialView();
        TextViewOnClick();
        ExitIntrodution();
    }//OnActivityCreate

    private void ExitIntrodution() {
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });
    }

    private void TextViewOnClick() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    getActivity().getSupportFragmentManager().beginTransaction()
                            .replace(R.id.FrameLayoutMain, new Content()).addToBackStack(null).commit();

            }
        });
    }

    private void InitialView() {
        textView = getView().findViewById(R.id.txtIntroduction);
        textView2 = getView().findViewById(R.id.txtIntroductionExit);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.introduction, container, false);
        return view;
    }//onCreateView
}//Main Class
