package org.tensorflow.lite;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface d extends AutoCloseable {

    public static class a {
        Boolean allowCancellation;
        private final List<c> delegateFactories;
        final List<b> delegates;
        int numThreads;
        EnumC1156a runtime;
        Boolean useNNAPI;
        Boolean useXNNPACK;
        bi.a validatedAccelerationConfig;

        /* JADX INFO: renamed from: org.tensorflow.lite.d$a$a, reason: collision with other inner class name */
        public enum EnumC1156a {
            FROM_APPLICATION_ONLY,
            FROM_SYSTEM_ONLY,
            PREFER_SYSTEM_OVER_APPLICATION
        }

        public a() {
            this.runtime = EnumC1156a.FROM_APPLICATION_ONLY;
            this.numThreads = -1;
            this.delegates = new ArrayList();
            this.delegateFactories = new ArrayList();
        }

        public a addDelegate(b bVar) {
            this.delegates.add(bVar);
            return this;
        }

        public a addDelegateFactory(c cVar) {
            this.delegateFactories.add(cVar);
            return this;
        }

        public bi.a getAccelerationConfig() {
            return null;
        }

        public List<c> getDelegateFactories() {
            return DesugarCollections.unmodifiableList(this.delegateFactories);
        }

        public List<b> getDelegates() {
            return DesugarCollections.unmodifiableList(this.delegates);
        }

        public int getNumThreads() {
            return this.numThreads;
        }

        public EnumC1156a getRuntime() {
            return this.runtime;
        }

        public boolean getUseNNAPI() {
            Boolean bool = this.useNNAPI;
            return bool != null && bool.booleanValue();
        }

        public boolean getUseXNNPACK() {
            Boolean bool = this.useXNNPACK;
            return bool == null || bool.booleanValue();
        }

        public boolean isCancellable() {
            Boolean bool = this.allowCancellation;
            return bool != null && bool.booleanValue();
        }

        public a setCancellable(boolean z10) {
            this.allowCancellation = Boolean.valueOf(z10);
            return this;
        }

        public a setNumThreads(int i10) {
            this.numThreads = i10;
            return this;
        }

        public a setRuntime(EnumC1156a enumC1156a) {
            this.runtime = enumC1156a;
            return this;
        }

        public a setUseNNAPI(boolean z10) {
            this.useNNAPI = Boolean.valueOf(z10);
            return this;
        }

        public a setUseXNNPACK(boolean z10) {
            this.useXNNPACK = Boolean.valueOf(z10);
            return this;
        }

        public a(a aVar) {
            this.runtime = EnumC1156a.FROM_APPLICATION_ONLY;
            this.numThreads = -1;
            this.numThreads = aVar.numThreads;
            this.useNNAPI = aVar.useNNAPI;
            this.allowCancellation = aVar.allowCancellation;
            this.delegates = new ArrayList(aVar.delegates);
            this.delegateFactories = new ArrayList(aVar.delegateFactories);
            this.runtime = aVar.runtime;
            this.useXNNPACK = aVar.useXNNPACK;
        }

        public a setAccelerationConfig(bi.a aVar) {
            return this;
        }
    }
}
