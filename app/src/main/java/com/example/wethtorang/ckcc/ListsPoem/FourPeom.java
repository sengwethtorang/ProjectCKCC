package com.example.wethtorang.ckcc.ListsPoem;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.wethtorang.ckcc.R;

import java.util.ArrayList;

/**
 * Created by WETHTORANG on 7/19/2016.
 */
public class FourPeom extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setDefaultDisplayHomeAsUpEnabled(true);
        setTitle("បទពាក្យបួន");
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view_list);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        ArrayList<Peom> Peom = new ArrayList<>();
        Peom peom = new Peom("គោរពទង់ជាតិ","សូមពួកទេព្ដា\t\tរក្សាមហាក្សត្រយើង\n" +

                "ឱ្យបានរុងរឿង\t\tដោយជយមង្គល សិរីសួស្ដី\n" +
                "យើងខ្ញុំព្រះអង្គ\tសូមជ្រកក្រោមម្លប់ព្រះបារមី\t\n" +
                "នៃព្រះនរបតី\t\tវង្សក្សត្រាដែលសាងប្រាសាទថ្ម\n" +
                "គ្រប់គ្រងដែនខ្មែរ\tបុរាណថ្កើនថ្កាន។\n");
        Peom peom1 = new Peom("ច្បាប់ប្រុស","សូមពួកទេព្ដា\t\tរក្សាមហាក្សត្រយើង\n" +
                "ឱ្យបានរុងរឿង\t\tដោយជយមង្គល សិរីសួស្ដី\n" +
                "យើងខ្ញុំព្រះអង្គ\tសូមជ្រកក្រោមម្លប់ព្រះបារមី\t\n" +
                "នៃព្រះនរបតី\t\tវង្សក្សត្រាដែលសាងប្រាសាទថ្ម\n" +
                "គ្រប់គ្រងដែនខ្មែរ\tបុរាណថ្កើនថ្កាន។\n");
        Peom peom2 = new Peom("ច្បាប់ស្រី","នេះបទកំណត់ចងជា \tភុជង្គលីលា \tចងជាច្បាប់ស្រី។\n" +
                "កាលនាងឥរន្ទវតី \tចរចាកតាមប្ដី \tគឺបុណ្យកយក្សា។\n" +
                "នាងវិមលាជាព្រះមាតា \tបើកបន្ទូលថា \tហៃកូនពិសី។\n" +
                "នាងនឹងត្រាច់ត្រង់តាមប្ដី \tចេញចាកអំពី \tពិភពនាគនេះ។\n" +
                "ទៅឋានមនុស្សលោកនាយអេះ \tចូរនាងចាំចេះ \tបម្រើស្វាមី។\n" +
                "ធ្វើវត្តប្រតិបត្តិប្រក្រតី \tកុំឲ្យស្វាមី \tអាក់អន់ចិន្ដា។\n" +
                "នាងអើយគម្ដែងក្រឡា \tជាម្ចាស់សិរសា \tកូនកុំមាក់ងាយ។\n" +
                "ហៃកូនស្រីមាសម្ដាយ \tក្រណាស់នាងអាយ \tតាមដោយច្បាប់ស្រី។");
        Peom peom3 = new Peom("ច្បាប់ក្រមងុយ","អ្នកព្រះភិរម្យ \tភាសាអ៊ូខ្ញុំ \tបង្គំនឹកគុណ\n" +
                "\tព្រះពុទ្ធព្រះធម៌ \tព្រះសង្ឃជាមុន \tគុណគាប់មហាធ្ងន់\n" +
                "\t\tមាតាបិតា\n" +
                "\tឧបជ្ឈាយ៍ជាធំ \tកាលចាប់ដៃខ្ញុំ \tអោយធម៌កេសា\n" +
                "\tអនុសាវន \tព្រះកម្មវាចា \tគុណតួអក្ខរា\n" +
                "\t\tទាំងសាមសិបបី\n" +
                "\tខែចែត្រឆ្នាំច \tចត្វាស័កក \tកគិតកាព្យថ្មី\n" +
                "\tលើច្បាប់ប្រដៅ \tកូនចៅប្រុសស្រី \tតូចក្ដីធំក្ដី\n" +
                "\t\tចូរស្ដាប់គ្រប់គ្នា។");
        Peom peom4 = new Peom("គំរូ","អ្នកព្រះភិរម្យ \tភាសាអ៊ូខ្ញុំ \tបង្គំនឹកគុណ\n" +
                "\tព្រះពុទ្ធព្រះធម៌ \tព្រះសង្ឃជាមុន \tគុណគាប់មហាធ្ងន់\n" +
                "\t\tមាតាបិតា\n" +
                "\tឧបជ្ឈាយ៍ជាធំ \tកាលចាប់ដៃខ្ញុំ \tអោយធម៌កេសា\n" +
                "\tអនុសាវន \tព្រះកម្មវាចា \tគុណតួអក្ខរា\n" +
                "\t\tទាំងសាមសិបបី\n" +
                "\tខែចែត្រឆ្នាំច \tចត្វាស័កក \tកគិតកាព្យថ្មី\n" +
                "\tលើច្បាប់ប្រដៅ \tកូនចៅប្រុសស្រី \tតូចក្ដីធំក្ដី\n" +
                "\t\tចូរស្ដាប់គ្រប់គ្នា។");
        Peom peom5 = new Peom("ប្រាសាទព្រះវិហារ","អាងព្រើលអាងប្រាជ្ញ \tអាងកោងអាងកាច \tអាងកាប់អាងចាក់\n" +
                "\tអាងជើងអាងដៃ \tអាងវាយអាងធាក់ \tអាងគុកច្រវាក់\n" +
                "\t\tអាងម៉ាស៊ីនកាត់ក។\n" +
                "\tអាងសុទ្ធតែខុស \tកូនអើយចាំចុះ \tអាងនោះមិនល្អ\n" +
                "\tអ្នកគិតអោយល្អិត \tដ្បិតស្រុកលោកក្រ \tប្រមាណតំណ\n" +
                "\t\tតទៀតទៅមុខ។\n" +
                "\tសាសនានៅឆ្ងាយ \tលែងបានសប្បាយ \tមានតែកើតទុក្ខ\n" +
                "\tកើតទាន់លោកីយ៍ \tលឺតែទំនុក \tដំណែលអាពុក\n" +
                "\t\tចូរចាំគ្រប់គ្នា។");
        Peom peom6 = new Peom("ក កា​ កិ កី","អ្នកជឿពាក្យចាស់ \tជឿចាំអោយណាស់ \tអ្នកហ៊ានស្បែកដាច\n" +
                "\tអ្នកខ្លាចស្បែកជា \tកុំធ្វើបំពារ \tមនុស្សចោរប៉ោបៀ\n" +
                "\t\tកុំយកខ្លួនបៀត។\n" +
                "\tឃើញរិកគេល្អ \tទោះបីមានក្រ \tយកគេជាញាតិ\n" +
                "\tគួររាប់អ្នកក្រៅ \tផៅអ្នកឯទៀត \tរាប់រើសមារយាទ\n" +
                "\t\tសុចរិតត្រឹមត្រូវ។");
        Peom peom7 = new Peom("ក​ ខ​ គ ឃ ង","រៀនបទរៀនបាទ \tកុំកោងហួសខ្នាត \tកុំភ្លាត់ខុសផ្លូវ\n" +
                "\tកុំភ្លើនភ្លេចម៉ែ \tកុំប្រែហួសឪ \tឃើញចាស់សក់ស្កូវ\n" +
                "\t\tកុំសូវមើលងាយ។\n" +
                "\tបន្ទន់អាត្មា \tខ្លាចមេខ្លាចបា \tខ្លាចតាខ្លាចយាយ\n" +
                "\tបំរើមហាក្សត្រ \tប្រយ័ត្នស្ដេចទាយ \tពាក្យពិតទំនាយ\n" +
                "\t\tរលាយកេរ្ដិ៍ឈ្មោះ។\n" +
                "\tពាក្យស្ដេចពាក្យគ្រូ \tមានប្រៃមានជូរ \tកំរពិរោះ\n" +
                "\tជួនទាយអោយទាប \tជួនទាយអោយខ្ពស់ \tទាយអោយសក្ដិយស\n" +
                "\t\tទាយចុះកុំខឹង។");
        Peom peom8 = new Peom("វិហារស្នេហា","រៀនបទរៀនបាទ \tកុំកោងហួសខ្នាត \tកុំភ្លាត់ខុសផ្លូវ\n" +
                "\tកុំភ្លើនភ្លេចម៉ែ \tកុំប្រែហួសឪ \tឃើញចាស់សក់ស្កូវ\n" +
                "\t\tកុំសូវមើលងាយ។\n" +
                "\tបន្ទន់អាត្មា \tខ្លាចមេខ្លាចបា \tខ្លាចតាខ្លាចយាយ\n" +
                "\tបំរើមហាក្សត្រ \tប្រយ័ត្នស្ដេចទាយ \tពាក្យពិតទំនាយ\n" +
                "\t\tរលាយកេរ្ដិ៍ឈ្មោះ។\n" +
                "\tពាក្យស្ដេចពាក្យគ្រូ \tមានប្រៃមានជូរ \tកំរពិរោះ\n" +
                "\tជួនទាយអោយទាប \tជួនទាយអោយខ្ពស់ \tទាយអោយសក្ដិយស\n" +
                "\t\tទាយចុះកុំខឹង។");
        Peom peom9 = new Peom("បេះដូងសំរាប់ចិត្ត","រៀនបទរៀនបាទ \tកុំកោងហួសខ្នាត \tកុំភ្លាត់ខុសផ្លូវ\n" +
                "\tកុំភ្លើនភ្លេចម៉ែ \tកុំប្រែហួសឪ \tឃើញចាស់សក់ស្កូវ\n" +
                "\t\tកុំសូវមើលងាយ។\n" +
                "\tបន្ទន់អាត្មា \tខ្លាចមេខ្លាចបា \tខ្លាចតាខ្លាចយាយ\n" +
                "\tបំរើមហាក្សត្រ \tប្រយ័ត្នស្ដេចទាយ \tពាក្យពិតទំនាយ\n" +
                "\t\tរលាយកេរ្ដិ៍ឈ្មោះ។\n" +
                "\tពាក្យស្ដេចពាក្យគ្រូ \tមានប្រៃមានជូរ \tកំរពិរោះ\n" +
                "\tជួនទាយអោយទាប \tជួនទាយអោយខ្ពស់ \tទាយអោយសក្ដិយស\n" +
                "\t\tទាយចុះកុំខឹង។");
        Peom peom10 = new Peom("ភូមិខ្មែរ","រៀនបទរៀនបាទ \tកុំកោងហួសខ្នាត \tកុំភ្លាត់ខុសផ្លូវ\n" +
                "\tកុំភ្លើនភ្លេចម៉ែ \tកុំប្រែហួសឪ \tឃើញចាស់សក់ស្កូវ\n" +
                "\t\tកុំសូវមើលងាយ។\n" +
                "\tបន្ទន់អាត្មា \tខ្លាចមេខ្លាចបា \tខ្លាចតាខ្លាចយាយ\n" +
                "\tបំរើមហាក្សត្រ \tប្រយ័ត្នស្ដេចទាយ \tពាក្យពិតទំនាយ\n" +
                "\t\tរលាយកេរ្ដិ៍ឈ្មោះ។\n" +
                "\tពាក្យស្ដេចពាក្យគ្រូ \tមានប្រៃមានជូរ \tកំរពិរោះ\n" +
                "\tជួនទាយអោយទាប \tជួនទាយអោយខ្ពស់ \tទាយអោយសក្ដិយស\n" +
                "\t\tទាយចុះកុំខឹង។");
        Peom peom11 = new Peom("ប្រាសាទអង្គរ","រៀនបទរៀនបាទ \tកុំកោងហួសខ្នាត \tកុំភ្លាត់ខុសផ្លូវ\n" +
                "\tកុំភ្លើនភ្លេចម៉ែ \tកុំប្រែហួសឪ \tឃើញចាស់សក់ស្កូវ\n" +
                "\t\tកុំសូវមើលងាយ។\n" +
                "\tបន្ទន់អាត្មា \tខ្លាចមេខ្លាចបា \tខ្លាចតាខ្លាចយាយ\n" +
                "\tបំរើមហាក្សត្រ \tប្រយ័ត្នស្ដេចទាយ \tពាក្យពិតទំនាយ\n" +
                "\t\tរលាយកេរ្ដិ៍ឈ្មោះ។\n" +
                "\tពាក្យស្ដេចពាក្យគ្រូ \tមានប្រៃមានជូរ \tកំរពិរោះ\n" +
                "\tជួនទាយអោយទាប \tជួនទាយអោយខ្ពស់ \tទាយអោយសក្ដិយស\n" +
                "\t\tទាយចុះកុំខឹង។");

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
