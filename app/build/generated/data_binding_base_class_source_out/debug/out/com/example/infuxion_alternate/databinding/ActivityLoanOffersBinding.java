// Generated by view binder compiler. Do not edit!
package com.example.infuxion_alternate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.infuxion_alternate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityLoanOffersBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView Weeks;

  @NonNull
  public final Button btnNext;

  @NonNull
  public final RelativeLayout rlTitle;

  @NonNull
  public final Spinner spInterest;

  @NonNull
  public final Spinner spLoanOffer;

  @NonNull
  public final ScrollView sv;

  @NonNull
  public final TextView textView14;

  @NonNull
  public final TextView textView15;

  @NonNull
  public final TextView textView20;

  @NonNull
  public final TextView textView38;

  @NonNull
  public final TextView textView40;

  @NonNull
  public final TextView titlebar;

  @NonNull
  public final TextView tvno;

  private ActivityLoanOffersBinding(@NonNull LinearLayout rootView, @NonNull TextView Weeks,
      @NonNull Button btnNext, @NonNull RelativeLayout rlTitle, @NonNull Spinner spInterest,
      @NonNull Spinner spLoanOffer, @NonNull ScrollView sv, @NonNull TextView textView14,
      @NonNull TextView textView15, @NonNull TextView textView20, @NonNull TextView textView38,
      @NonNull TextView textView40, @NonNull TextView titlebar, @NonNull TextView tvno) {
    this.rootView = rootView;
    this.Weeks = Weeks;
    this.btnNext = btnNext;
    this.rlTitle = rlTitle;
    this.spInterest = spInterest;
    this.spLoanOffer = spLoanOffer;
    this.sv = sv;
    this.textView14 = textView14;
    this.textView15 = textView15;
    this.textView20 = textView20;
    this.textView38 = textView38;
    this.textView40 = textView40;
    this.titlebar = titlebar;
    this.tvno = tvno;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoanOffersBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoanOffersBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_loan_offers, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoanOffersBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Weeks;
      TextView Weeks = ViewBindings.findChildViewById(rootView, id);
      if (Weeks == null) {
        break missingId;
      }

      id = R.id.btnNext;
      Button btnNext = ViewBindings.findChildViewById(rootView, id);
      if (btnNext == null) {
        break missingId;
      }

      id = R.id.rlTitle;
      RelativeLayout rlTitle = ViewBindings.findChildViewById(rootView, id);
      if (rlTitle == null) {
        break missingId;
      }

      id = R.id.spInterest;
      Spinner spInterest = ViewBindings.findChildViewById(rootView, id);
      if (spInterest == null) {
        break missingId;
      }

      id = R.id.spLoanOffer;
      Spinner spLoanOffer = ViewBindings.findChildViewById(rootView, id);
      if (spLoanOffer == null) {
        break missingId;
      }

      id = R.id.sv;
      ScrollView sv = ViewBindings.findChildViewById(rootView, id);
      if (sv == null) {
        break missingId;
      }

      id = R.id.textView14;
      TextView textView14 = ViewBindings.findChildViewById(rootView, id);
      if (textView14 == null) {
        break missingId;
      }

      id = R.id.textView15;
      TextView textView15 = ViewBindings.findChildViewById(rootView, id);
      if (textView15 == null) {
        break missingId;
      }

      id = R.id.textView20;
      TextView textView20 = ViewBindings.findChildViewById(rootView, id);
      if (textView20 == null) {
        break missingId;
      }

      id = R.id.textView38;
      TextView textView38 = ViewBindings.findChildViewById(rootView, id);
      if (textView38 == null) {
        break missingId;
      }

      id = R.id.textView40;
      TextView textView40 = ViewBindings.findChildViewById(rootView, id);
      if (textView40 == null) {
        break missingId;
      }

      id = R.id.titlebar;
      TextView titlebar = ViewBindings.findChildViewById(rootView, id);
      if (titlebar == null) {
        break missingId;
      }

      id = R.id.tvno;
      TextView tvno = ViewBindings.findChildViewById(rootView, id);
      if (tvno == null) {
        break missingId;
      }

      return new ActivityLoanOffersBinding((LinearLayout) rootView, Weeks, btnNext, rlTitle,
          spInterest, spLoanOffer, sv, textView14, textView15, textView20, textView38, textView40,
          titlebar, tvno);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
