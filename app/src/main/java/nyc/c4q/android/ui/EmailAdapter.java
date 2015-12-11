package nyc.c4q.android.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;

import java.util.Date;
import java.util.List;
import nyc.c4q.android.R;
import nyc.c4q.android.model.Email;

public class EmailAdapter extends BaseAdapter {
  private static final int MAX_BODY_LENGTH = 20;

  private final Context context;
  private final LayoutInflater inflater;
  private List<Email> emails;

  public EmailAdapter(Context context, List<Email> emails) {
    this.context = context;
    this.inflater = LayoutInflater.from(context);
    this.emails = emails;
  }

  @Override public int getCount() {
    return emails.size();
  }

  @Override public Email getItem(int position) {
    return emails.get(position);
  }

  @Override public long getItemId(int position) {
    return position;
  }

  @Override public View getView(int position, View view, ViewGroup parent) {

      RecyclerView.ViewHolder holder;
    if (view == null) {
      // TODO - load R.layout.list_email_row
      view = inflater.inflate(R.layout.list_email_row, parent, false);
        holder = new CustomViewHolder(view);
        holder.getAdapterPosition();
        view.setTag(holder);
    }
      else {
        holder = (RecyclerView.ViewHolder) view.getTag();
    }

    // TODO - setup views
    // TODO - get the email defined at 'position'
    // TODO - replace nulls
    Picasso.with(context)
        .load((String)null)
        .placeholder(R.mipmap.ic_launcher)
        .resizeDimen(R.dimen.list_image_size, R.dimen.list_image_size)
        .centerCrop()
        .into((ImageView)null);

    // TODO - set up other views
    // for body, only use MAX_BODY_LENGTH chars followed by "..."

    return view;
  }
}
class CustomViewHolder extends RecyclerView.ViewHolder {

    String from;
    String fromUrl;
    String subject;
    String body;
    Date sent;

    public CustomViewHolder(View itemView) {
        super(itemView);
        this.from = "-_-";
    }
}
