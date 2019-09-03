package srongklod_bangtamruat.p.TutorJava;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Layout_Main extends Fragment {
    private TextView textView;
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initialView();
        onClick();
    }//onActivity

    private void onClick() {
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.FrameLayoutMain, new introduction()).addToBackStack(null).commit();
            }
        });

    }//

    private void initialView() {
        textView = getView().findViewById(R.id.txtOpenBook);

    }//initial

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_main, container, false);
        return view;
    }//onCreateView
}//Main Class
