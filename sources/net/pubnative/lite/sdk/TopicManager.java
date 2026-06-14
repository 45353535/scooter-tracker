package net.pubnative.lite.sdk;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import net.pubnative.lite.sdk.models.Topic;
import net.pubnative.lite.sdk.provider.TopicProvider;
import net.pubnative.lite.sdk.provider.TopicsApiImpl;

/* JADX INFO: loaded from: classes3.dex */
public class TopicManager {
    private final String TAG = TopicManager.class.getSimpleName();
    private final List<TopicProvider> providers = new ArrayList();
    private List<Topic> topics = null;

    public TopicManager(Context context) {
        initProviders();
        fetchTopics(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void addTopics(List<Topic> list) {
        if (list != null) {
            try {
                if (!list.isEmpty()) {
                    if (this.topics == null) {
                        this.topics = new ArrayList();
                    }
                    for (Topic topic : list) {
                        if (topic != null && !this.topics.contains(topic)) {
                            this.topics.add(topic);
                        }
                    }
                }
            } finally {
            }
        }
    }

    private void fetchTopics(Context context) {
        if (this.providers.isEmpty()) {
            return;
        }
        this.topics = new ArrayList();
        TopicProvider.Callback callback = new TopicProvider.Callback() { // from class: net.pubnative.lite.sdk.e
            @Override // net.pubnative.lite.sdk.provider.TopicProvider.Callback
            public final void onResult(List list) {
                this.f95851a.addTopics(list);
            }
        };
        Iterator<TopicProvider> it = this.providers.iterator();
        while (it.hasNext()) {
            it.next().getTopics(context, callback);
        }
    }

    private void initProviders() {
        this.providers.add(new TopicsApiImpl());
    }

    public List<Topic> getTopics() {
        return this.topics;
    }
}
