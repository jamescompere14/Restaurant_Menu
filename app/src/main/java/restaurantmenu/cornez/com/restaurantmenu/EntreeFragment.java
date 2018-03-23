package restaurantmenu.cornez.com.restaurantmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 //* {@link EntreeFragment.} interface
 * to handle interaction events.
 * Use the {@link EntreeFragment#} factory method to
 * create an instance of this fragment.
 */
//OnFragmentInteractionListener
//newInstance
public class EntreeFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_entree, container, false);
    }
}
