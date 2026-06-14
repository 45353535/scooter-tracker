package com.explorestack.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class m0 extends n0 {

    static class b implements Map.Entry {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map.Entry f19225b;

        public m0 a() {
            return (m0) this.f19225b.getValue();
        }

        @Override // java.util.Map.Entry
        public Object getKey() {
            return this.f19225b.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            return null;
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof MessageLite) {
                return ((m0) this.f19225b.getValue()).b((MessageLite) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry entry) {
            this.f19225b = entry;
        }
    }

    static class c implements Iterator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Iterator f19226b;

        public c(Iterator it) {
            this.f19226b = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry next() {
            Map.Entry entry = (Map.Entry) this.f19226b.next();
            return entry.getValue() instanceof m0 ? new b(entry) : entry;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f19226b.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f19226b.remove();
        }
    }

    public abstract MessageLite d();
}
