package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public class a extends Fragment {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43578b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private InterfaceC0467a f43579a;

    /* JADX INFO: renamed from: com.ironsource.lifecycle.a$a, reason: collision with other inner class name */
    interface InterfaceC0467a {
        void a(Activity activity);

        void b(Activity activity);

        void onResume(Activity activity);
    }

    static a a(Activity activity) {
        return (a) activity.getFragmentManager().findFragmentByTag(f43578b);
    }

    static void b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(f43578b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new a(), f43578b).commit();
        fragmentManager.executePendingTransactions();
    }

    private void c(InterfaceC0467a interfaceC0467a) {
        if (interfaceC0467a != null) {
            interfaceC0467a.a(getActivity());
        }
    }

    void d(InterfaceC0467a interfaceC0467a) {
        this.f43579a = interfaceC0467a;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(this.f43579a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f43579a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        b(this.f43579a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        c(this.f43579a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    private void a(InterfaceC0467a interfaceC0467a) {
        if (interfaceC0467a != null) {
            interfaceC0467a.b(getActivity());
        }
    }

    private void b(InterfaceC0467a interfaceC0467a) {
        if (interfaceC0467a != null) {
            interfaceC0467a.onResume(getActivity());
        }
    }
}
