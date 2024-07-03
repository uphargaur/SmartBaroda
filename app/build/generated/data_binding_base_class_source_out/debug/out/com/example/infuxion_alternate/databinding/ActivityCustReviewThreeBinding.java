// Generated by view binder compiler. Do not edit!
package com.example.infuxion_alternate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.infuxion_alternate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityCustReviewThreeBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final AppCompatButton btnNext;

  @NonNull
  public final RadioButton company;

  @NonNull
  public final LinearLayout monthlyRent;

  @NonNull
  public final RadioButton owned;

  @NonNull
  public final RadioButton parental;

  @NonNull
  public final RadioButton rented;

  @NonNull
  public final RadioGroup residentialType;

  @NonNull
  public final RelativeLayout rlTitle;

  @NonNull
  public final ScrollView scrollview;

  @NonNull
  public final Spinner spState;

  @NonNull
  public final TextView titlebar;

  private ActivityCustReviewThreeBinding(@NonNull LinearLayout rootView,
      @NonNull AppCompatButton btnNext, @NonNull RadioButton company,
      @NonNull LinearLayout monthlyRent, @NonNull RadioButton owned, @NonNull RadioButton parental,
      @NonNull RadioButton rented, @NonNull RadioGroup residentialType,
      @NonNull RelativeLayout rlTitle, @NonNull ScrollView scrollview, @NonNull Spinner spState,
      @NonNull TextView titlebar) {
    this.rootView = rootView;
    this.btnNext = btnNext;
    this.company = company;
    this.monthlyRent = monthlyRent;
    this.owned = owned;
    this.parental = parental;
    this.rented = rented;
    this.residentialType = residentialType;
    this.rlTitle = rlTitle;
    this.scrollview = scrollview;
    this.spState = spState;
    this.titlebar = titlebar;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityCustReviewThreeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityCustReviewThreeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_cust_review_three, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityCustReviewThreeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btnNext;
      AppCompatButton btnNext = ViewBindings.findChildViewById(rootView, id);
      if (btnNext == null) {
        break missingId;
      }

      id = R.id.company;
      RadioButton company = ViewBindings.findChildViewById(rootView, id);
      if (company == null) {
        break missingId;
      }

      id = R.id.monthlyRent;
      LinearLayout monthlyRent = ViewBindings.findChildViewById(rootView, id);
      if (monthlyRent == null) {
        break missingId;
      }

      id = R.id.owned;
      RadioButton owned = ViewBindings.findChildViewById(rootView, id);
      if (owned == null) {
        break missingId;
      }

      id = R.id.parental;
      RadioButton parental = ViewBindings.findChildViewById(rootView, id);
      if (parental == null) {
        break missingId;
      }

      id = R.id.rented;
      RadioButton rented = ViewBindings.findChildViewById(rootView, id);
      if (rented == null) {
        break missingId;
      }

      id = R.id.residentialType;
      RadioGroup residentialType = ViewBindings.findChildViewById(rootView, id);
      if (residentialType == null) {
        break missingId;
      }

      id = R.id.rlTitle;
      RelativeLayout rlTitle = ViewBindings.findChildViewById(rootView, id);
      if (rlTitle == null) {
        break missingId;
      }

      id = R.id.scrollview;
      ScrollView scrollview = ViewBindings.findChildViewById(rootView, id);
      if (scrollview == null) {
        break missingId;
      }

      id = R.id.spState;
      Spinner spState = ViewBindings.findChildViewById(rootView, id);
      if (spState == null) {
        break missingId;
      }

      id = R.id.titlebar;
      TextView titlebar = ViewBindings.findChildViewById(rootView, id);
      if (titlebar == null) {
        break missingId;
      }

      return new ActivityCustReviewThreeBinding((LinearLayout) rootView, btnNext, company,
          monthlyRent, owned, parental, rented, residentialType, rlTitle, scrollview, spState,
          titlebar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
