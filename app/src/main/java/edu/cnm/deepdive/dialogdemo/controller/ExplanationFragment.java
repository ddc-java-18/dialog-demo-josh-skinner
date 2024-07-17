package edu.cnm.deepdive.dialogdemo.controller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import edu.cnm.deepdive.dialogdemo.R;

public class ExplanationFragment extends DialogFragment {

  public static final String camera_permission_title = "Camera Permission";

  @NonNull
  @Override
  public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
    return new AlertDialog.Builder(requireContext())
        .setTitle(R.string.camera_permission_title)
        .setIcon(android.R.drawable.ic_dialog_info)
        .setMessage("This app uses the camera to include images with notes.")
        .setNeutralButton(android.R.string.ok, (d, w) -> {})
        .create();

  }

  @Override
  public void onDismiss(@NonNull DialogInterface dialog) {
    super.onDismiss(dialog);
    ((AlertDismissHandler) requireActivity()).onDismiss();
  }

  public interface AlertDismissHandler {
    void onDismiss();
  }
}
