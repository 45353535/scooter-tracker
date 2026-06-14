package com.fyber.inneractive.sdk.external;

import android.annotation.TargetApi;
import com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener;

/* JADX INFO: loaded from: classes7.dex */
public interface InneractiveUnitController<EL extends EventsListener> {

    public static class AdDisplayError extends Exception {
        public AdDisplayError() {
        }

        public AdDisplayError(String str) {
            super(str);
        }

        public AdDisplayError(String str, Throwable th2) {
            super(str, th2);
        }

        public AdDisplayError(Throwable th2) {
            super(th2);
        }

        @TargetApi(24)
        public AdDisplayError(String str, Throwable th2, boolean z10, boolean z11) {
            super(str, th2, z10, z11);
        }
    }

    public interface EventsListener {
        void onAdClicked(InneractiveAdSpot inneractiveAdSpot);

        void onAdEnteredErrorState(InneractiveAdSpot inneractiveAdSpot, AdDisplayError adDisplayError);

        void onAdImpression(InneractiveAdSpot inneractiveAdSpot);

        void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot);

        void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot);
    }

    public static abstract class EventsListenerAdapter implements EventsListener {
        @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdClicked(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdImpression(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillCloseInternalBrowser(InneractiveAdSpot inneractiveAdSpot) {
        }

        @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController.EventsListener
        public void onAdWillOpenExternalApp(InneractiveAdSpot inneractiveAdSpot) {
        }
    }

    void addContentController(InneractiveContentController inneractiveContentController);

    void destroy();

    InneractiveAdSpot getAdSpot();

    EL getEventsListener();

    InneractiveContentController getSelectedContentController();

    void setEventsListener(EL el);
}
