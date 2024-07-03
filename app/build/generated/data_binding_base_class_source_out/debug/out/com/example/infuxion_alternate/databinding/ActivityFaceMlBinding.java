// Generated by view binder compiler. Do not edit!
package com.example.infuxion_alternate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.view.PreviewView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.infuxion_alternate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFaceMlBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final RelativeLayout rlTitle;

  @NonNull
  public final ImageView stepOne;

  @NonNull
  public final ImageView stepThree;

  @NonNull
  public final ImageView stepTwo;

  @NonNull
  public final TextView titlebar;

  @NonNull
  public final TextView tvStatus;

  @NonNull
  public final TextView tvStep;

  @NonNull
  public final PreviewView viewFinder;

  private ActivityFaceMlBinding(@NonNull LinearLayout rootView, @NonNull RelativeLayout rlTitle,
      @NonNull ImageView stepOne, @NonNull ImageView stepThree, @NonNull ImageView stepTwo,
      @NonNull TextView titlebar, @NonNull TextView tvStatus, @NonNull TextView tvStep,
      @NonNull PreviewView viewFinder) {
    this.rootView = rootView;
    this.rlTitle = rlTitle;
    this.stepOne = stepOne;
    this.stepThree = stepThree;
    this.stepTwo = stepTwo;
    this.titlebar = titlebar;
    this.tvStatus = tvStatus;
    this.tvStep = tvStep;
    this.viewFinder = viewFinder;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFaceMlBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFaceMlBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_face_ml, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFaceMlBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.rlTitle;
      RelativeLayout rlTitle = ViewBindings.findChildViewById(rootView, id);
      if (rlTitle == null) {
        break missingId;
      }

      id = R.id.stepOne;
      ImageView stepOne = ViewBindings.findChildViewById(rootView, id);
      if (stepOne == null) {
        break missingId;
      }

      id = R.id.stepThree;
      ImageView stepThree = ViewBindings.findChildViewById(rootView, id);
      if (stepThree == null) {
        break missingId;
      }

      id = R.id.stepTwo;
      ImageView stepTwo = ViewBindings.findChildViewById(rootView, id);
      if (stepTwo == null) {
        break missingId;
      }

      id = R.id.titlebar;
      TextView titlebar = ViewBindings.findChildViewById(rootView, id);
      if (titlebar == null) {
        break missingId;
      }

      id = R.id.tvStatus;
      TextView tvStatus = ViewBindings.findChildViewById(rootView, id);
      if (tvStatus == null) {
        break missingId;
      }

      id = R.id.tvStep;
      TextView tvStep = ViewBindings.findChildViewById(rootView, id);
      if (tvStep == null) {
        break missingId;
      }

      id = R.id.viewFinder;
      PreviewView viewFinder = ViewBindings.findChildViewById(rootView, id);
      if (viewFinder == null) {
        break missingId;
      }

      return new ActivityFaceMlBinding((LinearLayout) rootView, rlTitle, stepOne, stepThree,
          stepTwo, titlebar, tvStatus, tvStep, viewFinder);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
