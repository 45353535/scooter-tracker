package com.google.maps.android.collections;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class PolylineManager extends MapObjectManager<Polyline, Collection> implements GoogleMap.OnPolylineClickListener {
    public PolylineManager(@NonNull GoogleMap googleMap) {
        super(googleMap);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void b() {
        GoogleMap googleMap = this.f33906a;
        if (googleMap != null) {
            googleMap.setOnPolylineClickListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Polyline polyline) {
        polyline.remove();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolylineClickListener
    public void onPolylineClick(@NonNull Polyline polyline) {
        Collection collection = (Collection) this.f33908c.get(polyline);
        if (collection == null || collection.f33920c == null) {
            return;
        }
        collection.f33920c.onPolylineClick(polyline);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(Polyline polyline) {
        return super.remove(polyline);
    }

    public class Collection extends MapObjectManager.Collection {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GoogleMap.OnPolylineClickListener f33920c;

        public Collection() {
            super();
        }

        public void addAll(java.util.Collection<PolylineOptions> collection) {
            Iterator<PolylineOptions> it = collection.iterator();
            while (it.hasNext()) {
                addPolyline(it.next());
            }
        }

        public Polyline addPolyline(PolylineOptions polylineOptions) {
            Polyline polylineAddPolyline = PolylineManager.this.f33906a.addPolyline(polylineOptions);
            super.a(polylineAddPolyline);
            return polylineAddPolyline;
        }

        public java.util.Collection<Polyline> getPolylines() {
            return b();
        }

        public void hideAll() {
            Iterator<Polyline> it = getPolylines().iterator();
            while (it.hasNext()) {
                it.next().setVisible(false);
            }
        }

        public boolean remove(Polyline polyline) {
            return super.c(polyline);
        }

        public void setOnPolylineClickListener(GoogleMap.OnPolylineClickListener onPolylineClickListener) {
            this.f33920c = onPolylineClickListener;
        }

        public void showAll() {
            Iterator<Polyline> it = getPolylines().iterator();
            while (it.hasNext()) {
                it.next().setVisible(true);
            }
        }

        public void addAll(java.util.Collection<PolylineOptions> collection, boolean z10) {
            Iterator<PolylineOptions> it = collection.iterator();
            while (it.hasNext()) {
                addPolyline(it.next()).setVisible(z10);
            }
        }
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection newCollection(String str) {
        return super.newCollection(str);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public Collection newCollection() {
        return new Collection();
    }
}
