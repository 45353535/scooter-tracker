package com.google.maps.android.collections;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.maps.android.collections.MapObjectManager.Collection;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes9.dex */
public abstract class MapObjectManager<O, C extends Collection> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final GoogleMap f33906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f33907b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Map f33908c = new HashMap();

    public class Collection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set f33910a = new LinkedHashSet();

        public Collection() {
        }

        protected void a(Object obj) {
            this.f33910a.add(obj);
            MapObjectManager.this.f33908c.put(obj, this);
        }

        protected java.util.Collection b() {
            return DesugarCollections.unmodifiableCollection(this.f33910a);
        }

        protected boolean c(Object obj) {
            if (!this.f33910a.remove(obj)) {
                return false;
            }
            MapObjectManager.this.f33908c.remove(obj);
            MapObjectManager.this.a(obj);
            return true;
        }

        public void clear() {
            for (Object obj : this.f33910a) {
                MapObjectManager.this.a(obj);
                MapObjectManager.this.f33908c.remove(obj);
            }
            this.f33910a.clear();
        }
    }

    public MapObjectManager(@NonNull GoogleMap googleMap) {
        this.f33906a = googleMap;
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.maps.android.collections.MapObjectManager.1
            @Override // java.lang.Runnable
            public void run() {
                MapObjectManager.this.b();
            }
        });
    }

    protected abstract void a(Object obj);

    abstract void b();

    public C getCollection(String str) {
        return (C) this.f33907b.get(str);
    }

    public abstract C newCollection();

    public C newCollection(String str) {
        if (this.f33907b.get(str) == null) {
            C c10 = (C) newCollection();
            this.f33907b.put(str, c10);
            return c10;
        }
        throw new IllegalArgumentException("collection id is not unique: " + str);
    }

    public boolean remove(O o10) {
        Collection collection = (Collection) this.f33908c.get(o10);
        return collection != null && collection.c(o10);
    }
}
