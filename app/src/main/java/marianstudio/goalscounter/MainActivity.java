/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package marianstudio.goalscounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int goalsTeamA = 0;
    int foulsTeamA = 0;
    int cornersTeamA = 0;
    int goalsTeamB = 0;
    int foulsTeamB = 0;
    int cornersTeamB = 0;
    sdfdsfdsfsdfsdfsdfsfdfsdfsdf

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneGoalForTeamA(View v) {
        goalsTeamA++;
        displayForTeamA(goalsTeamA, R.id.team_a_goals);
    }

    public void addOneFoulForTeamA(View v) {
        foulsTeamA++;
        displayForTeamA(foulsTeamA, R.id.team_a_fouls);
    }

    public void addOneCornerForTeamA(View v) {
        cornersTeamA++;
        displayForTeamA(cornersTeamA, R.id.team_a_corners);
    }

    public void addOneGoalForTeamB(View v) {
        goalsTeamB++;
        displayForTeamB(goalsTeamB, R.id.team_b_goals);
    }

    public void addOneFoulForTeamB(View v) {
        foulsTeamB++;
        displayForTeamB(foulsTeamB, R.id.team_b_fouls);
    }

    public void addOneCornerForTeamB(View v) {
        cornersTeamB++;
        displayForTeamB(cornersTeamB, R.id.team_b_corners);
    }

    public void resetScore(View v) {
        goalsTeamA = 0;
        foulsTeamA = 0;
        cornersTeamA = 0;
        goalsTeamB = 0;
        foulsTeamB = 0;
        cornersTeamB = 0;

        displayForTeamA(goalsTeamA, R.id.team_a_goals);
        displayForTeamA(foulsTeamA, R.id.team_a_fouls);
        displayForTeamA(cornersTeamA, R.id.team_a_corners);

        displayForTeamB(goalsTeamB, R.id.team_b_goals);
        displayForTeamA(foulsTeamB, R.id.team_b_fouls);
        displayForTeamA(cornersTeamB, R.id.team_b_corners);


    }

    public void displayForTeamA(int score, int textViewId) {
        TextView scoreView = (TextView) findViewById(textViewId);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score, int textViewId) {
        TextView scoreView = (TextView) findViewById(textViewId);
        scoreView.setText(String.valueOf(score));
    }
}
