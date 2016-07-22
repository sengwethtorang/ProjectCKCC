package com.example.wethtorang.ckcc.ListsPoem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.wethtorang.ckcc.R;

import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setTitle("បទភុជុង្គលីលា");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_list);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<Peom> Peom = new ArrayList<>();
        Peom peom = new Peom("ព្រះរាជាណាចក្រកម្ពុជា"," ច្រៀងរាំកៀកកេះកៀវ ឱបស្រើបស្រៀវតាមបទភ្លេង\n" +
                "ញ័រញាក់ហក់កញ្ឆេង ខ្មែរវង្វេងតាមបារាំង។\n" +
                "\n" +
                "មន្ត្រីខ្មែរសប្បាយ រាស្ត្រខ្វល់ខ្វាយកើតទុក្ខខ្លាំង\n" +
                "លោកធំខ្ញុំបារាំង ឈ្លក់ញៀនខ្លាំងតាំងប្រវ័ញ្ច។\n" +
                "\n" +
                "ឈ្លក់ឆ្ងាញ់ឈ្លក់ហ៊ឺហារ ខំស្រវាកន្លែងខ្លាញ់\n" +
                "ឲ្យបានប្រាក់ចំណេញ គ្រាន់បំពេញមហិច្ឆតា។\n" +
                "\n" +
                "តមកជាទម្លាប់ ជាប់ក្នុងសង្គមខេមរា\n" +
                "ឲ្យតែអ្នកធ្វើការ តែងប្រាថ្នាលាភសក្ការៈ។");
        Peom peom1 = new Peom("ច្បាប់ប្រុស"," សំណែនសែនសំណូក បានធ្វើលោកសូកឡើងស័ក្តិ\n" +
                "ងាយស្រួលរកមាសប្រាក់ ជាទស្សនៈមន្ត្រីខ្មែរ។\n" +
                "\n" +
                "រលួយពុកដល់ឆ្អឹង ម្នាក់ៗប្រឹងបូមគ្មានល្ហែ\n" +
                "ជាតិស្គមគ្មានថ្នាំកែ ព្រោះតែខ្មែរខ្លះបំពាន។\n" +
                "\n" +
                "ខ្លះលួចលក់ព្រៃឈើ ធ្វើសេដ្ឋីសល់វាល់លាន\n" +
                "ខ្វះទៀតលក់ថ្នាំញៀន មានប្រាក់ផ្ញើនៅបរទេស?។");
        Peom peom2 = new Peom("ច្បាប់ស្រី"," សំណែនសែនសំណូក បានធ្វើលោកសូកឡើងស័ក្តិ\n" +
                "ងាយស្រួលរកមាសប្រាក់ ជាទស្សនៈមន្ត្រីខ្មែរ។\n" +
                "\n" +
                "រលួយពុកដល់ឆ្អឹង ម្នាក់ៗប្រឹងបូមគ្មានល្ហែ\n" +
                "ជាតិស្គមគ្មានថ្នាំកែ ព្រោះតែខ្មែរខ្លះបំពាន។\n" +
                "\n" +
                "ខ្លះលួចលក់ព្រៃឈើ ធ្វើសេដ្ឋីសល់វាល់លាន\n" +
                "ខ្វះទៀតលក់ថ្នាំញៀន មានប្រាក់ផ្ញើនៅបរទេស?។");
        Peom peom3 = new Peom("ច្បាប់ក្រមងុយ"," ជំងឺពុករលួយ ជារោគមួយសម្រាប់ខ្មែរ\n" +
                "កើតមានតហូរហែ តាំងតែពីរាជ្យបារាំង។\n" +
                "\n" +
                "របបអង្គុយតុ បង្កទុក្ខកង្វល់ខ្លាំង\n" +
                "ជាក្អែលដែលបារាំង រៀបតែងតាំងទុកឲ្យខ្មែរ។\n" +
                "\n" +
                "កញ្ឆា ស្រាអាភៀន ផឹក ជក់ ញៀន លៀនភ្នែកត្លែ\n" +
                "បា បន គ្រាន់លំហែ មន្ត្រីខ្មែរឈ្លក់វង្វេង។");
        Peom peom4 = new Peom("គំរូ"," ជំងឺពុករលួយ ជារោគមួយសម្រាប់ខ្មែរ\n" +
                "កើតមានតហូរហែ តាំងតែពីរាជ្យបារាំង។\n" +
                "\n" +
                "របបអង្គុយតុ បង្កទុក្ខកង្វល់ខ្លាំង\n" +
                "ជាក្អែលដែលបារាំង រៀបតែងតាំងទុកឲ្យខ្មែរ។\n" +
                "\n" +
                "កញ្ឆា ស្រាអាភៀន ផឹក ជក់ ញៀន លៀនភ្នែកត្លែ\n" +
                "បា បន គ្រាន់លំហែ មន្ត្រីខ្មែរឈ្លក់វង្វេង។");
        Peom peom5 = new Peom("ប្រាសាទព្រះវិហារ"," ជំងឺពុករលួយ ជារោគមួយសម្រាប់ខ្មែរ\n" +
                "កើតមានតហូរហែ តាំងតែពីរាជ្យបារាំង។\n" +
                "\n" +
                "របបអង្គុយតុ បង្កទុក្ខកង្វល់ខ្លាំង\n" +
                "ជាក្អែលដែលបារាំង រៀបតែងតាំងទុកឲ្យខ្មែរ។\n" +
                "\n" +
                "កញ្ឆា ស្រាអាភៀន ផឹក ជក់ ញៀន លៀនភ្នែកត្លែ\n" +
                "បា បន គ្រាន់លំហែ មន្ត្រីខ្មែរឈ្លក់វង្វេង។");
        Peom peom6 = new Peom("ក កា​ កិ កី"," ជំងឺពុករលួយ ជារោគមួយសម្រាប់ខ្មែរ\n" +
                "កើតមានតហូរហែ តាំងតែពីរាជ្យបារាំង។\n" +
                "\n" +
                "របបអង្គុយតុ បង្កទុក្ខកង្វល់ខ្លាំង\n" +
                "ជាក្អែលដែលបារាំង រៀបតែងតាំងទុកឲ្យខ្មែរ។\n" +
                "\n" +
                "កញ្ឆា ស្រាអាភៀន ផឹក ជក់ ញៀន លៀនភ្នែកត្លែ\n" +
                "បា បន គ្រាន់លំហែ មន្ត្រីខ្មែរឈ្លក់វង្វេង។");
        Peom peom7 = new Peom("ក​ ខ​ គ ឃ ង"," ជំងឺពុករលួយ ជារោគមួយសម្រាប់ខ្មែរ\n" +
                "កើតមានតហូរហែ តាំងតែពីរាជ្យបារាំង។\n" +
                "\n" +
                "របបអង្គុយតុ បង្កទុក្ខកង្វល់ខ្លាំង\n" +
                "ជាក្អែលដែលបារាំង រៀបតែងតាំងទុកឲ្យខ្មែរ។\n" +
                "\n" +
                "កញ្ឆា ស្រាអាភៀន ផឹក ជក់ ញៀន លៀនភ្នែកត្លែ\n" +
                "បា បន គ្រាន់លំហែ មន្ត្រីខ្មែរឈ្លក់វង្វេង។");
        Peom peom8 = new Peom("វិហារស្នេហា"," ជំងឺពុករលួយ ជារោគមួយសម្រាប់ខ្មែរ\n" +
                "កើតមានតហូរហែ តាំងតែពីរាជ្យបារាំង។\n" +
                "\n" +
                "របបអង្គុយតុ បង្កទុក្ខកង្វល់ខ្លាំង\n" +
                "ជាក្អែលដែលបារាំង រៀបតែងតាំងទុកឲ្យខ្មែរ។\n" +
                "\n" +
                "កញ្ឆា ស្រាអាភៀន ផឹក ជក់ ញៀន លៀនភ្នែកត្លែ\n" +
                "បា បន គ្រាន់លំហែ មន្ត្រីខ្មែរឈ្លក់វង្វេង។");
        Peom peom9 = new Peom("បេះដូងសំរាប់ចិត្ត"," ជំងឺពុករលួយ ជារោគមួយសម្រាប់ខ្មែរ\n" +
                "កើតមានតហូរហែ តាំងតែពីរាជ្យបារាំង។\n" +
                "\n" +
                "របបអង្គុយតុ បង្កទុក្ខកង្វល់ខ្លាំង\n" +
                "ជាក្អែលដែលបារាំង រៀបតែងតាំងទុកឲ្យខ្មែរ។\n" +
                "\n" +
                "កញ្ឆា ស្រាអាភៀន ផឹក ជក់ ញៀន លៀនភ្នែកត្លែ\n" +
                "បា បន គ្រាន់លំហែ មន្ត្រីខ្មែរឈ្លក់វង្វេង។");
        Peom peom10 = new Peom("ភូមិខ្មែរ","Content");
        Peom peom11 = new Peom("ប្រាសាទអង្គរ","Content");

        Peom.add(peom);
        Peom.add(peom1);
        Peom.add(peom2);
        Peom.add(peom3);
        Peom.add(peom4);
        Peom.add(peom5);
        Peom.add(peom6);
        Peom.add(peom7);
        Peom.add(peom8);
        Peom.add(peom9);
        Peom.add(peom10);
        Peom.add(peom11);

        ListsPoemAdapter listsPoemAdapter= new ListsPoemAdapter(Peom,this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(listsPoemAdapter);
        recyclerView.setHasFixedSize(true);
    }
}
