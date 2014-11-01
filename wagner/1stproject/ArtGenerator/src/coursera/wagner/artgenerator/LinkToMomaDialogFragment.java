package coursera.wagner.artgenerator;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class LinkToMomaDialogFragment extends DialogFragment {
	
	public static LinkToMomaDialogFragment newInstance() {
		return new LinkToMomaDialogFragment();
	}
	
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		return new AlertDialog.Builder(getActivity()).
				setMessage(getText(R.string.moreMessage)).
				setCancelable(true).
				setPositiveButton(getString(R.string.morePositiveButton), new DialogInterface.OnClickListener() {
					
					public void onClick(DialogInterface dialog, int which) {
						Intent intent = new Intent(Intent.ACTION_DEFAULT, Uri.parse("http://www.moma.org/"));
						LinkToMomaDialogFragment.this.startActivity(intent);
					}
				}).
				setNegativeButton(getString(R.string.moreNegativeButton), new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
					}
				})
				.create();
	}
}
