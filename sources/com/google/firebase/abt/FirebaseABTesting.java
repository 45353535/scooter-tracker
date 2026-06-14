package com.google.firebase.abt;

import android.content.Context;
import androidx.annotation.WorkerThread;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class FirebaseABTesting {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f31719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f31721c = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface OriginService {
        public static final String INAPP_MESSAGING = "fiam";
        public static final String REMOTE_CONFIG = "frc";
    }

    public FirebaseABTesting(Context context, Provider<AnalyticsConnector> provider, String str) {
        this.f31719a = provider;
        this.f31720b = str;
    }

    private void a(AnalyticsConnector.ConditionalUserProperty conditionalUserProperty) {
        ((AnalyticsConnector) this.f31719a.get()).setConditionalUserProperty(conditionalUserProperty);
    }

    private void b(List list) {
        ArrayDeque arrayDeque = new ArrayDeque(e());
        int iH = h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            while (arrayDeque.size() >= iH) {
                i(((AnalyticsConnector.ConditionalUserProperty) arrayDeque.pollFirst()).name);
            }
            AnalyticsConnector.ConditionalUserProperty conditionalUserPropertyF = abtExperimentInfo.f(this.f31720b);
            a(conditionalUserPropertyF);
            arrayDeque.offer(conditionalUserPropertyF);
        }
    }

    private static List c(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(AbtExperimentInfo.b((Map) it.next()));
        }
        return arrayList;
    }

    private boolean d(List list, AbtExperimentInfo abtExperimentInfo) {
        String strC = abtExperimentInfo.c();
        String strE = abtExperimentInfo.e();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo2 = (AbtExperimentInfo) it.next();
            if (abtExperimentInfo2.c().equals(strC) && abtExperimentInfo2.e().equals(strE)) {
                return true;
            }
        }
        return false;
    }

    private List e() {
        return ((AnalyticsConnector) this.f31719a.get()).getConditionalUserProperties(this.f31720b, "");
    }

    private ArrayList f(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            if (!d(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo);
            }
        }
        return arrayList;
    }

    private ArrayList g(List list, List list2) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AbtExperimentInfo abtExperimentInfo = (AbtExperimentInfo) it.next();
            if (!d(list2, abtExperimentInfo)) {
                arrayList.add(abtExperimentInfo.f(this.f31720b));
            }
        }
        return arrayList;
    }

    private int h() {
        if (this.f31721c == null) {
            this.f31721c = Integer.valueOf(((AnalyticsConnector) this.f31719a.get()).getMaxUserProperties(this.f31720b));
        }
        return this.f31721c.intValue();
    }

    private void i(String str) {
        ((AnalyticsConnector) this.f31719a.get()).clearConditionalUserProperty(str, null, null);
    }

    private void j(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            i(((AnalyticsConnector.ConditionalUserProperty) it.next()).name);
        }
    }

    private void k(List list) throws AbtException {
        if (list.isEmpty()) {
            removeAllExperiments();
            return;
        }
        List<AbtExperimentInfo> allExperiments = getAllExperiments();
        j(g(allExperiments, list));
        b(f(list, allExperiments));
    }

    private void l() throws AbtException {
        if (this.f31719a.get() == null) {
            throw new AbtException("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
    }

    @WorkerThread
    public List<AbtExperimentInfo> getAllExperiments() throws AbtException {
        l();
        List listE = e();
        ArrayList arrayList = new ArrayList();
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            arrayList.add(AbtExperimentInfo.a((AnalyticsConnector.ConditionalUserProperty) it.next()));
        }
        return arrayList;
    }

    @WorkerThread
    public void removeAllExperiments() throws AbtException {
        l();
        j(e());
    }

    @WorkerThread
    public void replaceAllExperiments(List<Map<String, String>> list) throws AbtException {
        l();
        if (list == null) {
            throw new IllegalArgumentException("The replacementExperiments list is null.");
        }
        k(c(list));
    }

    @WorkerThread
    public void reportActiveExperiment(AbtExperimentInfo abtExperimentInfo) throws AbtException {
        l();
        AbtExperimentInfo.h(abtExperimentInfo);
        ArrayList arrayList = new ArrayList();
        Map mapG = abtExperimentInfo.g();
        mapG.remove("triggerEvent");
        arrayList.add(AbtExperimentInfo.b(mapG));
        b(arrayList);
    }

    @WorkerThread
    public void validateRunningExperiments(List<AbtExperimentInfo> list) throws AbtException {
        l();
        j(g(getAllExperiments(), list));
    }
}
