package kz.kaliolla.museum.activivty;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import kz.kaliolla.museum.DataManager;
import kz.kaliolla.museum.R;
import kz.kaliolla.museum.model.Record;

public class RecordsHistoryAdpter extends RecyclerView.Adapter<RecordsHistoryAdpter.RecordsHistoryViewHolder> {
    private List<Record> records;
    private LayoutInflater inflater;
    private Context context;
    private RefreshView refreshView;

    public RecordsHistoryAdpter(Context context, List<Record> records, RefreshView view) {
        this.records = records;
        this.context = context;
        this.inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.refreshView = view;
    }

    @NonNull
    @Override
    public RecordsHistoryViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = inflater.inflate(R.layout.item_record_history, viewGroup, false);
        return new RecordsHistoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecordsHistoryViewHolder recordsHistoryViewHolder, int position) {
        Record record = records.get(position);
        recordsHistoryViewHolder.title.setText(record.getTitle());
        recordsHistoryViewHolder.shortText.setText(record.getShortText().length() > 50 ? record.getShortText().substring(0, 47) + "..." : record.getShortText());
    }

    @Override
    public int getItemCount() {
        return records.size();
    }

    class RecordsHistoryViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.title)
        TextView title;
        @BindView(R.id.short_text)
        TextView shortText;
        @BindView(R.id.delete)
        View delete;

        public RecordsHistoryViewHolder(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    context.startActivity(RecordActivity.getIntent(context, records.get(getAdapterPosition()).getQr()));
                }
            });
            delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int adapterPosition = getAdapterPosition();
                    DataManager.deleteFromHistory(adapterPosition);
                    records.remove(adapterPosition);
                    notifyItemRemoved(adapterPosition);
                    if (refreshView != null) refreshView.refreshView();
                }
            });
        }
    }

    interface RefreshView {
        void refreshView();
    }
}
