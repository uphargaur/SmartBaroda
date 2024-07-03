// Generated by view binder compiler. Do not edit!
package com.example.infuxion_alternate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.infuxion_alternate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegBridgeNsBinding implements ViewBinding {
  @NonNull
  private final LinearLayoutCompat rootView;

  @NonNull
  public final AppCompatButton buttonNo;

  @NonNull
  public final AppCompatButton buttonYes;

  @NonNull
  public final AppCompatImageView imgPinIcon;

  private ActivityRegBridgeNsBinding(@NonNull LinearLayoutCompat rootView,
      @NonNull AppCompatButton buttonNo, @NonNull AppCompatButton buttonYes,
      @NonNull AppCompatImageView imgPinIcon) {
    this.rootView = rootView;
    this.buttonNo = buttonNo;
    this.buttonYes = buttonYes;
    this.imgPinIcon = imgPinIcon;
  }

  @Override
  @NonNull
  public LinearLayoutCompat getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegBridgeNsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegBridgeNsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_reg_bridge_ns, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegBridgeNsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonNo;
      AppCompatButton buttonNo = ViewBindings.findChildViewById(rootView, id);
      if (buttonNo == null) {
        break missingId;
      }

      id = R.id.buttonYes;
      AppCompatButton buttonYes = ViewBindings.findChildViewById(rootView, id);
      if (buttonYes == null) {
        break missingId;
      }

      id = R.id.img_pin_icon;
      AppCompatImageView imgPinIcon = ViewBindings.findChildViewById(rootView, id);
      if (imgPinIcon == null) {
        break missingId;
      }

      return new ActivityRegBridgeNsBinding((LinearLayoutCompat) rootView, buttonNo, buttonYes,
          imgPinIcon);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
