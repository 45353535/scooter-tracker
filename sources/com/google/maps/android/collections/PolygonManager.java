package com.google.maps.android.collections;

import androidx.annotation.NonNull;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Polygon;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.maps.android.collections.MapObjectManager;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
public class PolygonManager extends MapObjectManager<Polygon, Collection> implements GoogleMap.OnPolygonClickListener {
    public PolygonManager(GoogleMap googleMap) {
        super(googleMap);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    void b() {
        GoogleMap googleMap = this.f33906a;
        if (googleMap != null) {
            googleMap.setOnPolygonClickListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.maps.android.collections.MapObjectManager
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void a(Polygon polygon) {
        polygon.remove();
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ MapObjectManager.Collection getCollection(String str) {
        return super.getCollection(str);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnPolygonClickListener
    public void onPolygonClick(@NonNull Polygon polygon) {
        Collection collection = (Collection) this.f33908c.get(polygon);
        if (collection == null || collection.f33918c == null) {
            return;
        }
        collection.f33918c.onPolygonClick(polygon);
    }

    @Override // com.google.maps.android.collections.MapObjectManager
    public /* bridge */ /* synthetic */ boolean remove(Polygon polygon) {
        return super.remove(polygon);
    }

    public class Collection extends MapObjectManager.Collection {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private GoogleMap.OnPolygonClickListener f33918c;

        public Collection() {
            super();
        }

        public void addAll(java.util.Collection<PolygonOptions> collection) {
            Iterator<PolygonOptions> it = collection.iterator();
            while (it.hasNext()) {
                addPolygon(it.next());
            }
        }

        public Polygon addPolygon(PolygonOptions polygonOptions) {
            Polygon polygonAddPolygon = PolygonManager.this.f33906a.addPolygon(polygonOptions);
            super.a(polygonAddPolygon);
            return polygonAddPolygon;
        }

        public java.util.Collection<Polygon> getPolygons() {
            return b();
        }

        public void hideAll() {
            Iterator<Polygon> it = getPolygons().iterator();
            while (it.hasNext()) {
                it.next().setVisible(false);
            }
        }

        public boolean remove(Polygon polygon) {
            return super.c(polygon);
        }

        public void setOnPolygonClickListener(GoogleMap.OnPolygonClickListener onPolygonClickListener) {
            this.f33918c = onPolygonClickListener;
        }

        public void showAll() {
            Iterator<Polygon> it = getPolygons().iterator();
            while (it.hasNext()) {
                it.next().setVisible(true);
            }
        }

        public void addAll(java.util.Collection<PolygonOptions> collection, boolean z10) {
            Iterator<PolygonOptions> it = collection.iterator();
            while (it.hasNext()) {
                addPolygon(it.next()).setVisible(z10);
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
