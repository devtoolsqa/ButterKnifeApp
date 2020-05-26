// Generated code from Butter Knife. Do not modify!
package com.butterknifeapp;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class FirstFragment_ViewBinding implements Unbinder {
  private FirstFragment target;

  private View view7f08002b;

  private View view7f080028;

  private View view7f080029;

  @UiThread
  public FirstFragment_ViewBinding(final FirstFragment target, View source) {
    this.target = target;

    View view;
    target.textView = Utils.findRequiredViewAsType(source, R.id.textview_first, "field 'textView'", TextView.class);
    view = Utils.findRequiredView(source, R.id.button_next, "field 'button' and method 'firstButtonClick'");
    target.button = Utils.castView(view, R.id.button_next, "field 'button'", Button.class);
    view7f08002b = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.firstButtonClick();
      }
    });
    view = Utils.findRequiredView(source, R.id.button2, "field 'button2' and method 'multipleButtonEvent'");
    target.button2 = Utils.castView(view, R.id.button2, "field 'button2'", Button.class);
    view7f080028 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.multipleButtonEvent();
      }
    });
    view = Utils.findRequiredView(source, R.id.button3, "field 'button3', method 'multipleButtonEvent', and method 'longClick'");
    target.button3 = Utils.castView(view, R.id.button3, "field 'button3'", Button.class);
    view7f080029 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.multipleButtonEvent();
      }
    });
    view.setOnLongClickListener(new View.OnLongClickListener() {
      @Override
      public boolean onLongClick(View p0) {
        target.longClick();
        return true;
      }
    });
  }

  @Override
  @CallSuper
  public void unbind() {
    FirstFragment target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.textView = null;
    target.button = null;
    target.button2 = null;
    target.button3 = null;

    view7f08002b.setOnClickListener(null);
    view7f08002b = null;
    view7f080028.setOnClickListener(null);
    view7f080028 = null;
    view7f080029.setOnClickListener(null);
    view7f080029.setOnLongClickListener(null);
    view7f080029 = null;
  }
}
