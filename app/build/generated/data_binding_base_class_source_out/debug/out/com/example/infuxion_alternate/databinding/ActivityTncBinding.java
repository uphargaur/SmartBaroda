// Generated by view binder compiler. Do not edit!
package com.example.infuxion_alternate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.infuxion_alternate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityTncBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final Button btAllowTnc;

  @NonNull
  public final CheckBox checkboxTnc;

  @NonNull
  public final CardView cvMain;

  @NonNull
  public final RelativeLayout rlTitle;

  @NonNull
  public final ScrollView svTnc;

  @NonNull
  public final TextView titlebar;

  private ActivityTncBinding(@NonNull RelativeLayout rootView, @NonNull Button btAllowTnc,
      @NonNull CheckBox checkboxTnc, @NonNull CardView cvMain, @NonNull RelativeLayout rlTitle,
      @NonNull ScrollView svTnc, @NonNull TextView titlebar) {
    this.rootView = rootView;
    this.btAllowTnc = btAllowTnc;
    this.checkboxTnc = checkboxTnc;
    this.cvMain = cvMain;
    this.rlTitle = rlTitle;
    this.svTnc = svTnc;
    this.titlebar = titlebar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityTncBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityTncBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_tnc, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityTncBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btAllowTnc;
      Button btAllowTnc = ViewBindings.findChildViewById(rootView, id);
      if (btAllowTnc == null) {
        break missingId;
      }

      id = R.id.checkbox_tnc;
      CheckBox checkboxTnc = ViewBindings.findChildViewById(rootView, id);
      if (checkboxTnc == null) {
        break missingId;
      }

      id = R.id.cvMain;
      CardView cvMain = ViewBindings.findChildViewById(rootView, id);
      if (cvMain == null) {
        break missingId;
      }

      id = R.id.rlTitle;
      RelativeLayout rlTitle = ViewBindings.findChildViewById(rootView, id);
      if (rlTitle == null) {
        break missingId;
      }

      id = R.id.svTnc;
      ScrollView svTnc = ViewBindings.findChildViewById(rootView, id);
      if (svTnc == null) {
        break missingId;
      }

      id = R.id.titlebar;
      TextView titlebar = ViewBindings.findChildViewById(rootView, id);
      if (titlebar == null) {
        break missingId;
      }

      return new ActivityTncBinding((RelativeLayout) rootView, btAllowTnc, checkboxTnc, cvMain,
          rlTitle, svTnc, titlebar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
