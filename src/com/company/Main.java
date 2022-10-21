package com.company;

import com.company.model.CeilingFan;
import com.company.service.CeilingFanService;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        CeilingFanService ceilingFanService = new CeilingFanService();
        createJFrame(ceilingFanService);

    }

    private static void createJFrame(CeilingFanService ceilingFanService) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(400, 190);
        jFrame.setLayout(null);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton bSpeed=new JButton("speed up");
        jFrame.add(bSpeed);
        bSpeed.setBounds(100,100,90, 30);

        JButton bDirection=new JButton("change direction");
        jFrame.add(bDirection);
        bDirection.setBounds(200,100,130, 30);

        JLabel lbFanStatus;
        lbFanStatus = new JLabel("The fan is ");
        lbFanStatus.setBounds(130, 15, 100, 30);
        jFrame.add(lbFanStatus);

        JLabel lbStatusValue;
        lbStatusValue = new JLabel(ceilingFanService.showStatus().isOff() ? "OFF" : "ON");
        lbStatusValue.setBounds(190, 15, 100, 30);
        jFrame.add(lbStatusValue);

        JLabel lbFanTypeName;
        lbFanTypeName = new JLabel("Fan Type: ");
        lbFanTypeName.setBounds(130, 30, 100, 30);
        jFrame.add(lbFanTypeName);

        JLabel lbFanTypeValue;
        lbFanTypeValue = new JLabel(CeilingFan.getFanTypeName());
        lbFanTypeValue.setBounds(190, 30, 100, 30);
        jFrame.add(lbFanTypeValue);

        JLabel lbFanSpeed;
        lbFanSpeed = new JLabel("Fan speed: ");
        lbFanSpeed.setBounds(130, 50, 100, 30);
        jFrame.add(lbFanSpeed);

        JLabel lbSpeedValue;
        lbSpeedValue = new JLabel(ceilingFanService.showStatus().getSpeed().getSpeedIndex().toString());
        lbSpeedValue.setBounds(200, 50, 100, 30);
        jFrame.add(lbSpeedValue);


        JLabel lbFanDirection;
        lbFanDirection = new JLabel("Fan direction :");
        lbFanDirection.setBounds(130, 70, 100, 30);
        jFrame.add(lbFanDirection);

        JLabel lbDirectionValue;
        lbDirectionValue = new JLabel(ceilingFanService.showStatus().getDirection().getDirectionMode());
        lbDirectionValue.setBounds(215, 70, 100, 30);
        jFrame.add(lbDirectionValue);

        bSpeed.addActionListener(e -> {
            lbSpeedValue.setText(ceilingFanService.increaseSpeed().toString());
            lbStatusValue.setText(ceilingFanService.showStatus().isOff() ? "OFF" : "ON");
        });
        bDirection.addActionListener(e -> lbDirectionValue.setText(ceilingFanService.changeDirection()));
    }
}
