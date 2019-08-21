package srongklod_bangtamruat.p.TutorJava;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.regex.Pattern;

public class Download_Dev extends Fragment {
    private TextView textView;
    private String string = "https://www.jetbrains.com/idea/download/#section=windows";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }//OnCreate

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        InitialView();
        TextViewController();
    }//OnActivity

    private void TextViewController() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    // pattern we want to match and turn into a clickable link
                    Pattern pattern = Pattern.compile("www.jetbrains.com/idea/download/#section=windows");
                    // prefix our pattern with http://
                    Linkify.addLinks(textView, pattern, "https://");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }//TextViewController

    private void InitialView() {
        textView = getView().findViewById(R.id.txtLink);
    }//InitialView

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.download_dev, container, false);
        return view;
    }//OnCreateView

}//Main Class
