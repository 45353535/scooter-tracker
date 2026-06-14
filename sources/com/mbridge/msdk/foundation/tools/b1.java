package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class b1 {

    class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        JSONArray f48946a = new JSONArray();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f48947b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f48948c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View.OnTouchListener f48949d;

        a(View view, String str, View.OnTouchListener onTouchListener) {
            this.f48947b = view;
            this.f48948c = str;
            this.f48949d = onTouchListener;
        }

        private void a() {
            this.f48946a = new JSONArray();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0) {
                b1.b(this.f48946a, motionEvent);
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                a();
                b1.b(this.f48946a, motionEvent);
                b1.b(this.f48947b, motionEvent, this.f48946a, this.f48948c);
            } else if (actionMasked == 1) {
                b1.b(this.f48947b, motionEvent, this.f48946a, this.f48948c);
                a();
            } else if (actionMasked == 3) {
                a();
            }
            View.OnTouchListener onTouchListener = this.f48949d;
            if (onTouchListener == null) {
                return false;
            }
            onTouchListener.onTouch(view, motionEvent);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(View view, MotionEvent motionEvent, JSONArray jSONArray, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("targetView", a(view, motionEvent));
            jSONObject.put("eventList", jSONArray);
        } catch (JSONException e10) {
            Log.e("TouchEventReporter", "JSON build error", e10);
        }
        com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(str);
        if (cVarB != null) {
            com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
            eVar.a("eventList", jSONObject);
            cVarB.b("m_check_local_c", eVar);
        }
    }

    public static void a(View view, String str, int i10) {
        a(view, str, i10, (View.OnTouchListener) null);
    }

    public static void a(View view, String str, int i10, View.OnTouchListener onTouchListener) {
        if (i10 != 0) {
            if (view == null) {
                return;
            }
            view.setOnTouchListener(new a(view, str, onTouchListener));
            return;
        }
        try {
            com.mbridge.msdk.foundation.same.report.metrics.c cVarB = com.mbridge.msdk.foundation.same.report.metrics.d.b().b(str);
            if (cVarB != null) {
                cVarB.a(cVarB.t() + "m_check_local_c");
            }
        } catch (Exception e10) {
            q0.b("TouchEventReporter", e10.getMessage());
        }
        if (onTouchListener == null || view == null) {
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(JSONArray jSONArray, MotionEvent motionEvent) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(C4240b4.i.f42633j0, a(motionEvent));
            jSONObject.put("eventTime", String.valueOf(motionEvent.getEventTime()));
            jSONObject.put("downTime", String.valueOf(motionEvent.getDownTime()));
            JSONArray jSONArray2 = new JSONArray();
            for (int i10 = 0; i10 < motionEvent.getPointerCount(); i10++) {
                JSONObject jSONObject2 = new JSONObject();
                if (Build.VERSION.SDK_INT >= 29) {
                    jSONObject2.put("x", String.valueOf(motionEvent.getRawX(i10)));
                    jSONObject2.put("y", String.valueOf(motionEvent.getRawY(i10)));
                } else {
                    jSONObject2.put("x", String.valueOf(motionEvent.getRawX()));
                    jSONObject2.put("y", String.valueOf(motionEvent.getRawY()));
                }
                jSONObject2.put("pressure", String.valueOf(motionEvent.getPressure(i10)));
                jSONObject2.put("size", String.valueOf(motionEvent.getSize(i10)));
                jSONObject2.put("id", motionEvent.getPointerId(i10));
                jSONArray2.put(jSONObject2);
            }
            jSONObject.put("point", jSONArray2);
            jSONArray.put(jSONObject);
        } catch (Exception e10) {
            Log.e("TouchEventReporter", "collectEvent JSON error", e10);
        }
    }

    private static String a(View view, MotionEvent motionEvent) {
        float rawX = motionEvent.getRawX();
        float rawY = motionEvent.getRawY();
        if (view instanceof ViewGroup) {
            view = a((ViewGroup) view, (int) rawX, (int) rawY);
        }
        return a(view);
    }

    private static String a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            return "down";
        }
        if (actionMasked == 1) {
            return "up";
        }
        if (actionMasked == 2) {
            return "move";
        }
        if (actionMasked == 3) {
            return MenuActionType.CANCEL;
        }
        if (actionMasked == 5) {
            return "pointer_down_" + motionEvent.getPointerId(motionEvent.getActionIndex());
        }
        if (actionMasked != 6) {
            return "other_" + motionEvent.getActionMasked();
        }
        return "pointer_up_" + motionEvent.getPointerId(motionEvent.getActionIndex());
    }

    private static View a(ViewGroup viewGroup, int i10, int i11) {
        View viewA;
        int[] iArr = new int[2];
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt.getVisibility() == 0) {
                childAt.getLocationOnScreen(iArr);
                int i12 = iArr[0];
                int i13 = iArr[1];
                int width = childAt.getWidth() + i12;
                int height = childAt.getHeight() + i13;
                if (i10 >= i12 && i10 <= width && i11 >= i13 && i11 <= height) {
                    return (!(childAt instanceof ViewGroup) || (viewA = a((ViewGroup) childAt, i10, i11)) == null) ? childAt : viewA;
                }
            }
        }
        return viewGroup;
    }

    private static String a(View view) {
        if (view == null) {
            return "UnknownView";
        }
        String resourceEntryName = view.getId() != -1 ? view.getResources().getResourceEntryName(view.getId()) : "";
        return view.getClass().getSimpleName() + "#" + resourceEntryName + "#" + (view.getContentDescription() != null ? view.getContentDescription().toString() : "");
    }
}
