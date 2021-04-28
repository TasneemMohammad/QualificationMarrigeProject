package com.example.qualificationmarrigeproject.Activty_main_Cards;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.qualificationmarrigeproject.Before_Engagement_Activity;
import com.example.qualificationmarrigeproject.Engagement_Activity;
import com.example.qualificationmarrigeproject.Marriage_Activity;
import com.example.qualificationmarrigeproject.R;


import java.util.List;

public class Recycler_Adapter_Cards extends RecyclerView.Adapter<Recycler_Adapter_Cards.ViewHolder_Cards> {
   List<Data_Class_Cards> list_cards ;
    Context context ;
   LayoutInflater inflater ;

    public Recycler_Adapter_Cards(Context context ,List<Data_Class_Cards> list_cards) {
        this.list_cards = list_cards;
        this.context = context;
        this.inflater  = LayoutInflater.from(context);
    }

    public ViewHolder_Cards onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = inflater.inflate(R.layout.rv_cards_layout ,null, false); // null?
        return new ViewHolder_Cards(view) ;
    }

    public void onBindViewHolder(@NonNull ViewHolder_Cards holder, final int position) {
     Data_Class_Cards card = list_cards.get(position);
     holder.tv_title_card.setText(card.getTitle_card());
     holder.img_card.setImageResource(card.getImg_card());
     holder.cardView.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
         Intent intent ;
         switch (position){
             case 0 :
                 intent = new Intent(context , Before_Engagement_Activity.class);
                 context.startActivity(intent);
                 break;
             case 1 :
                 intent = new Intent(context , Engagement_Activity.class);
                 context.startActivity(intent);
                 break;
             case 2 :
                 intent = new Intent(context , Marriage_Activity.class);
                 context.startActivity(intent);
                 break;
             default :

         }
         }
     });
    }

    public int getItemCount() {
        return list_cards.size();
    }

    public class ViewHolder_Cards extends RecyclerView.ViewHolder {
        TextView tv_title_card ;
        ImageView img_card ;
        CardView cardView ;
        public ViewHolder_Cards(@NonNull View itemView) {
            super(itemView);
        tv_title_card = itemView.findViewById(R.id.tv_title_card);
        img_card = itemView.findViewById(R.id.img_card);
        cardView = itemView.findViewById(R.id.cardView_cards);


        }
    }
}

//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