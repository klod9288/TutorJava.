package srongklod_bangtamruat.p.TutorJava;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Content extends Fragment {
    private TextView textView,textView1,textView2,textView3,textView4,textView5, textView6,textView7
            ,textView8,textView9;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }//Main Method

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        InitialView();
        TextViewController();
        CreateToolbar();
    }//onActivityCreate

    private void CreateToolbar() {

        Toolbar toolbar = getView().findViewById(R.id.toolbarContent);
        ((MainActivity)getActivity()).setSupportActionBar(toolbar);
        ((MainActivity)getActivity()).getSupportActionBar().setTitle("Content");
        ((MainActivity)getActivity()).getSupportActionBar().setHomeButtonEnabled(true);
        ((MainActivity)getActivity()).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().popBackStack();
            }
        });

    }//Create Toolbar

    private void TextViewController() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameLayoutMain, new Download_Dev()).addToBackStack(null).commit();
            }
        });

        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameLayoutMain, new InstallProgramEditor()).addToBackStack(null).commit();
            }
        });

        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameLayoutMain, new Content_Lesson2()).addToBackStack(null).commit();
            }
        });

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameLayoutMain, new DetailGroupDev()).addToBackStack(null).commit();
            }
        });

        textView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameLayoutMain, new Content_Lesson1()).addToBackStack(null).commit();
            }
        });
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameLayoutMain, new Content_Lesson1_1()).addToBackStack(null).commit();
            }
        });

        textView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameLayoutMain, new Content_Lesson1_2()).addToBackStack(null).commit();
            }
        });
        textView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameLayoutMain, new Content_Lesson2_2()).addToBackStack(null).commit();
            }
        });

        textView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameLayoutMain, new Content_Lesson3()).addToBackStack(null).commit();
            }
        });

        textView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameLayoutMain, new Content_Lesson3_2()).addToBackStack(null).commit();
            }
        });

    }//TextView Controller

    private void InitialView() {
        textView = getView().findViewById(R.id.txtDownDev);
        textView1 = getView().findViewById(R.id.txtInstall);
        textView2 = getView().findViewById(R.id.txtAppHelloWorld);
        textView3 = getView().findViewById(R.id.txtDetailGroupDev);
        textView4 = getView().findViewById(R.id.txtJavaLesson1);
        textView5 = getView().findViewById(R.id.txtJavaLesson1_1);
        textView6 = getView().findViewById(R.id.txtJavaLesson1_2);
        textView7 = getView().findViewById(R.id.txtJavaLesson2_2);
        textView8 = getView().findViewById(R.id.txtJavaLesson3);
        textView9 = getView().findViewById(R.id.txtJavaLesson3_2);

    }//InitialView

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.content, container, false);
        return view;
    }//OnCreateView

}//Main Class
