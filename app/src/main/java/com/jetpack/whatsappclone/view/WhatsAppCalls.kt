package com.jetpack.whatsappclone.view

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jetpack.whatsappclone.R
import com.jetpack.whatsappclone.model.SampleData
import java.text.SimpleDateFormat
import java.util.*

@SuppressLint("SimpleDateFormat")
@Composable
fun WhatsAppCalls() {
    val date = SimpleDateFormat("hh:mm a")
    val strDate: String = date.format(Date())

    val listOfData = listOf(
        SampleData("Name 1", "Make It Easy Sample 1", "Sample Url", strDate),
        SampleData("Name 2", "Make It Easy Sample 2", "Sample Url", strDate),
        SampleData("Name 3", "Make It Easy Sample 3", "Sample Url", strDate),
        SampleData("Name 4", "Make It Easy Sample 4", "Sample Url", strDate),
        SampleData("Name 5", "Make It Easy Sample 5", "Sample Url", strDate),
        SampleData("Name 6", "Make It Easy Sample 6", "Sample Url", strDate),
        SampleData("Name 7", "Make It Easy Sample 7", "Sample Url", strDate),
        SampleData("Name 8", "Make It Easy Sample 8", "Sample Url", strDate),
        SampleData("Name 9", "Make It Easy Sample 9", "Sample Url", strDate),
        SampleData("Name 10", "Make It Easy Sample 10", "Sample Url", strDate)
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        LazyColumn {
            items(listOfData.size) { index ->
                WhatsAppCallList(listOfData[index], index)
            }
        }
    }
}

@Composable
fun WhatsAppCallList(sampleData: SampleData, index: Int) {
    Column(
        modifier = Modifier.padding(5.dp)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.ic_baseline_run_circle_24),
                contentDescription = "User Image",
                modifier = Modifier
                    .width(70.dp)
                    .height(70.dp)
                    .padding(5.dp)
                    .weight(0.2f)
            )
            Column(
                modifier = Modifier
                    .padding(5.dp)
                    .weight(0.7f)
            ) {
                Text(
                    text = sampleData.name,
                    fontSize = 15.sp,
                    color = Color.Black,
                    fontWeight = FontWeight.Bold
                )

                Spacer(modifier = Modifier.padding(5.dp))

                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(
                            if (index % 2 == 0) {
                                R.drawable.ic_income_call
                            } else {
                                R.drawable.ic_outgoing_call
                            }
                        ),
                        contentDescription = "Income & Outgoing call icons",
                        modifier = Modifier
                            .width(20.dp)
                            .height(20.dp)
                            .padding(0.dp, 0.dp, 3.dp, 0.dp)
                    )

                    Text(
                        text = "Today, ${sampleData.createdDate}",
                        fontSize = 15.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.Bold
                    )
                }
            }

            Image(
                painter = painterResource(
                    if (index % 2 == 0) {
                        R.drawable.ic_baseline_call_24
                    } else {
                        R.drawable.ic_baseline_videocam_24
                    }
                ),
                contentDescription = "Income & Outgoing call icons",
                modifier = Modifier
                    .width(30.dp)
                    .height(30.dp)
                    .padding(5.dp)
                    .weight(0.2f)
            )
        }
    }
}