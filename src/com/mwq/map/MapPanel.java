/*
 * MapPanel.java
 *
 * Created on 2008��6��24��, ����2:54
 */
package com.mwq.map;

import com.mwq.map.frame.ProgressBarDialog;
import com.mwq.map.frame.ManageSignDialog;
import com.mwq.map.frame.AdvancedSearchDialog;
import com.mwq.map.frame.ShowSignDialog;
import com.mwq.map.dao.Dao;
import com.mwq.map.frame.ManageSortDialog;
import com.mwq.map.tool.InstancePool;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import com.mwq.map.tool.MapProcessor;
import java.awt.Cursor;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;


public class MapPanel extends javax.swing.JPanel {

    private Dao dao = Dao.getInstance();
    private MapProcessor mapProcessor;

    /** Creates new form MapPanel */
    public MapPanel() {
        initComponents();
    }

    public MapProcessor getMapProcessor() {
        return mapProcessor;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        signPopupMenu = new javax.swing.JPopupMenu();
        showMenuItem = new javax.swing.JMenuItem();
        separator = new javax.swing.JSeparator();
        createMenuItem = new javax.swing.JMenuItem();
        updateMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        leftPanel = new javax.swing.JPanel();
        bigMapLabel = new com.mwq.map.mwing.BigMapLabel();
        adjustMapPanel = new javax.swing.JPanel();
        upButton = new javax.swing.JButton();
        downButton = new javax.swing.JButton();
        revertButton = new javax.swing.JButton();
        leftButton = new javax.swing.JButton();
        rightButton = new javax.swing.JButton();
        subButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        slider = new javax.swing.JSlider();
        rightPanel = new javax.swing.JPanel();
        smallMapLabel = new com.mwq.map.mwing.SmallMapLabel();
        searchPanel = new javax.swing.JPanel();
        searchConditionPanel = new javax.swing.JPanel();
        keywordTextField = new javax.swing.JTextField();
        searchButtonPanel = new javax.swing.JPanel();
        simpleButton = new javax.swing.JButton();
        advancedButton = new javax.swing.JButton();
        searchResultScrollPane = new javax.swing.JScrollPane();
        searchResultList = new javax.swing.JList();
        managePanel = new javax.swing.JPanel();
        manageSortButton = new javax.swing.JButton();
        setMapButton = new javax.swing.JButton();

        showMenuItem.setText("�鿴��Ϣ");
        showMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showMenuItemActionPerformed(evt);
            }
        });
        signPopupMenu.add(showMenuItem);
        signPopupMenu.add(separator);

        createMenuItem.setText("�������");
        createMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createMenuItemActionPerformed(evt);
            }
        });
        signPopupMenu.add(createMenuItem);

        updateMenuItem.setText("�޸ı��");
        updateMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateMenuItemActionPerformed(evt);
            }
        });
        signPopupMenu.add(updateMenuItem);

        deleteMenuItem.setText("ɾ�����");
        deleteMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteMenuItemActionPerformed(evt);
            }
        });
        signPopupMenu.add(deleteMenuItem);

        setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });
        setLayout(new java.awt.BorderLayout());

        leftPanel.setLayout(new java.awt.BorderLayout());

        bigMapLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        bigMapLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bigMapLabelMouseClicked(evt);
            }
        });
        bigMapLabel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                bigMapLabelMouseMoved(evt);
            }
        });
        leftPanel.add(bigMapLabel, java.awt.BorderLayout.CENTER);

        adjustMapPanel.setLayout(new java.awt.GridBagLayout());

        upButton.setText("��");
        upButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                upButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(5, 0, 0, 0);
        adjustMapPanel.add(upButton, gridBagConstraints);

        downButton.setText("��");
        downButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                downButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 5, 0);
        adjustMapPanel.add(downButton, gridBagConstraints);

        revertButton.setText("��");
        revertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                revertButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        adjustMapPanel.add(revertButton, gridBagConstraints);

        leftButton.setText("<");
        leftButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 40, 0, 0);
        adjustMapPanel.add(leftButton, gridBagConstraints);

        rightButton.setText(">");
        rightButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 0, 20);
        adjustMapPanel.add(rightButton, gridBagConstraints);

        subButton.setText("-");
        subButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 20, 0, 0);
        adjustMapPanel.add(subButton, gridBagConstraints);

        addButton.setText("+");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        adjustMapPanel.add(addButton, gridBagConstraints);

        slider.setMajorTickSpacing(50);
        slider.setMaximum(300);
        slider.setMinimum(-300);
        slider.setMinorTickSpacing(25);
        slider.setPaintTicks(true);
        slider.setSnapToTicks(true);
        slider.setValue(-250);
        slider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sliderStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.insets = new java.awt.Insets(0, 5, 0, 5);
        adjustMapPanel.add(slider, gridBagConstraints);

        leftPanel.add(adjustMapPanel, java.awt.BorderLayout.SOUTH);

        add(leftPanel, java.awt.BorderLayout.CENTER);

        rightPanel.setLayout(new java.awt.BorderLayout());

        smallMapLabel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        smallMapLabel.setPreferredSize(new java.awt.Dimension(200, 200));
        rightPanel.add(smallMapLabel, java.awt.BorderLayout.NORTH);

        searchPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchPanel.setLayout(new java.awt.BorderLayout());

        searchConditionPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        searchConditionPanel.setLayout(new javax.swing.BoxLayout(searchConditionPanel, javax.swing.BoxLayout.Y_AXIS));

        keywordTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                keywordTextFieldKeyReleased(evt);
            }
        });
        searchConditionPanel.add(keywordTextField);

        simpleButton.setText("����");
        simpleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpleButtonActionPerformed(evt);
            }
        });
        searchButtonPanel.add(simpleButton);

        advancedButton.setText("�߼�");
        advancedButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                advancedButtonActionPerformed(evt);
            }
        });
        searchButtonPanel.add(advancedButton);

        searchConditionPanel.add(searchButtonPanel);

        searchPanel.add(searchConditionPanel, java.awt.BorderLayout.NORTH);

        searchResultList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        searchResultList.setFixedCellWidth(20);
        searchResultList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                searchResultListValueChanged(evt);
            }
        });
        searchResultScrollPane.setViewportView(searchResultList);

        searchPanel.add(searchResultScrollPane, java.awt.BorderLayout.CENTER);

        rightPanel.add(searchPanel, java.awt.BorderLayout.CENTER);

        managePanel.setPreferredSize(new java.awt.Dimension(0, 102));
        managePanel.setLayout(new java.awt.GridLayout(1, 0));

        manageSortButton.setText("ά�����");
        manageSortButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageSortButtonActionPerformed(evt);
            }
        });
        managePanel.add(manageSortButton);

        setMapButton.setText("������ͼ");
        setMapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                setMapButtonActionPerformed(evt);
            }
        });
        managePanel.add(setMapButton);

        rightPanel.add(managePanel, java.awt.BorderLayout.SOUTH);

        add(rightPanel, java.awt.BorderLayout.EAST);
    }// </editor-fold>                        

private void upButtonActionPerformed(java.awt.event.ActionEvent evt) {                                         
// TODO add your handling code here:
    bigMapLabel.setIcon(mapProcessor.moveOfVertical(-100));// ˢ�µ�ͼ��ʾ��
    //�жϴ�ֱ�ƶ���ť�Ƿ����

    if (!downButton.isEnabled()) {
        downButton.setEnabled(true);
    } else {
        if (mapProcessor.getShowCenterY() - mapProcessor.getCutMapHeight() / 2 < 2) {
            upButton.setEnabled(false);
        }
    }
    SwingUtilities.updateComponentTreeUI(smallMapLabel);// ˢ��ӥ��������
}                                        

private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
// TODO add your handling code here:
    slider.setValue(slider.getValue() + 25);// �����ű�������һ����λ
}                                         

private void setMapButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
// TODO add your handling code here:
    int showConfirmDialog = JOptionPane.showConfirmDialog(MapPanel.this, "ȷ��Ҫ������ͼ��", "������ʾ", JOptionPane.YES_NO_OPTION);
    if (showConfirmDialog == 0) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileFilter() {

            @Override
            public boolean accept(File file) {
                if (file.isDirectory()) {
                    return true;
                } else {
                    String fileName = file.getName().toUpperCase();
                    if (fileName.endsWith(".JPG") || fileName.endsWith(".JPEG") || fileName.endsWith(".GIF")) {
                        return true;
                    } else {
                        return false;
                    }
                }
            }

            @Override
            public String getDescription() {
                return "��ͼ��ʽ��.JPG��.JPEG��.GIF��";
            }
        });
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            String mapPath = this.getClass().getResource("/img/map").getPath();
            new File(mapPath + "/" + dao.getMapName()).delete();
            File selectedMapFile = fileChooser.getSelectedFile();
            File upLoadFile = new File(mapPath + "/map" + selectedMapFile.getName().substring(selectedMapFile.getName().lastIndexOf(".")));
            dao.setMapName(upLoadFile.getName());
            try {
                InputStream inStream = new FileInputStream(selectedMapFile);
                OutputStream outStream = new FileOutputStream(upLoadFile);

                int readBytes = 0; // ��ȡ�ֽ���

                byte[] buffer = new byte[1024]; // ���建������

                while ((readBytes = inStream.read(buffer, 0, 1024)) != -1) {// ����������ȡ���ݵ�����������

                    outStream.write(buffer, 0, readBytes); // �����������е���������������

                }

                outStream.close();// �ر����������

                inStream.close();// �ر�����������

            } catch (Exception ex) {
                Logger.getLogger(MapPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
            MapPanel.this.mapProcessor.replaceMap("/img/map/" + upLoadFile.getName());
            slider.setValue(slider.getValue() + 1);
            smallMapLabel.refreshScale();
            smallMapLabel.setIcon(new ImageIcon(mapProcessor.zoom(200, 200)));
        }
    }
}                                            

private void subButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
// TODO add your handling code here:
    slider.setValue(slider.getValue() - 25);// �����ű�����Сһ����λ
}                                         

private void sliderStateChanged(javax.swing.event.ChangeEvent evt) {                                    
// TODO add your handling code here:

    int v = slider.getValue();// ��û����ֵ

    // �жϱ���������ť�Ƿ����
    if (v == slider.getMinimum()) {// ����Ϊ��Сֵ

        subButton.setEnabled(false);// ��С��ť������

        if (!addButton.isEnabled()) {// �������ť������

            addButton.setEnabled(true);// ���õ���ť����

        }
    } else if (v == slider.getMaximum()) {// ����Ϊ���ֵ

        addButton.setEnabled(false);// ����ť������

        if (!subButton.isEnabled()) {// �����С��ť������

            subButton.setEnabled(true);// ���õ�С��ť����

        }
    } else {

        if (!subButton.isEnabled()) {// �����С��ť������

            subButton.setEnabled(true);// ���õ�С��ť����

        }

        if (!addButton.isEnabled()) {// �������ť������

            addButton.setEnabled(true);// ���õ���ť����

        }
    }
    //ˢ�µ�ͼ
    bigMapLabel.setIcon(mapProcessor.adjustScale(v));// �ػ��ͼ��ʾ��

    SwingUtilities.updateComponentTreeUI(smallMapLabel);// �ػ�ӥ��������

    //�ж�ˮƽ�ƶ���ť�Ƿ����
    int w = mapProcessor.getCutMapWidth() / 2;
    if (mapProcessor.getShowCenterX() - w < 2 || mapProcessor.getMap().getWidth() - mapProcessor.getShowCenterX() - w < 2) {
        if (mapProcessor.getShowCenterX() <= w) {
            leftButton.setEnabled(false);
        } else {
            rightButton.setEnabled(false);
        }
    } else {
        if (!leftButton.isEnabled()) {
            leftButton.setEnabled(true);
        }
        if (!rightButton.isEnabled()) {
            rightButton.setEnabled(true);
        }
    }
    //�жϴ�ֱ�ƶ���ť�Ƿ����
    int h = mapProcessor.getCutMapHeight() / 2;
    if (mapProcessor.getShowCenterY() - h < 2 || mapProcessor.getMap().getHeight() - mapProcessor.getShowCenterY() - h < 2) {
        if (mapProcessor.getShowCenterY() <= h) {
            upButton.setEnabled(false);
        } else {
            downButton.setEnabled(false);
        }
    } else {
        if (!upButton.isEnabled()) {
            upButton.setEnabled(true);
        }
        if (!downButton.isEnabled()) {
            downButton.setEnabled(true);
        }
    }
}                                   

private void manageSortButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                 
// TODO add your handling code here:
    new ManageSortDialog(null, true, slider, searchResultList).setVisible(true);
}                                                

private void formComponentResized(java.awt.event.ComponentEvent evt) {                                      
// TODO add your handling code here:
    if (mapProcessor == null) {
        final ProgressBarDialog progressBarDialog = new ProgressBarDialog(null, true);
        new Thread() {

            @Override
            public void run() {
                mapProcessor = new MapProcessor("/img/map/map.jpg", getBigMapLabel().getWidth(), getBigMapLabel().getHeight(), slider.getValue());
                InstancePool.setMapProcessor(mapProcessor);
                InstancePool.setScaleSlider(slider);
                getBigMapLabel().setIcon(mapProcessor.adjustWindow(getBigMapLabel().getWidth(), getBigMapLabel().getHeight()));
                smallMapLabel.setIcon(new ImageIcon(mapProcessor.zoom(200, 200)));
                progressBarDialog.dispose();
            }
        }.start();
        progressBarDialog.setVisible(true);
    } else {
        getBigMapLabel().setIcon(mapProcessor.adjustWindow(getBigMapLabel().getWidth(), getBigMapLabel().getHeight()));
        SwingUtilities.updateComponentTreeUI(smallMapLabel);
    }
}                                     

private void downButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
// TODO add your handling code here:    
    getBigMapLabel().setIcon(mapProcessor.moveOfVertical(100));// ˢ�µ�ͼ��ʾ��

    if (!upButton.isEnabled()) {
        upButton.setEnabled(true);
    } else {
        if (mapProcessor.getMap().getHeight() - mapProcessor.getShowCenterY() - mapProcessor.getCutMapHeight() / 2 < 2) {
            downButton.setEnabled(false);
        }
    }
    SwingUtilities.updateComponentTreeUI(smallMapLabel);// ˢ��ӥ��������
}                                          

private void leftButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
// TODO add your handling code here:    
    getBigMapLabel().setIcon(mapProcessor.moveOfHorizontal(-100));// ˢ�µ�ͼ��ʾ��
    //�ж�ˮƽ�ƶ���ť�Ƿ����

    if (!rightButton.isEnabled()) {
        rightButton.setEnabled(true);
    } else {
        if (mapProcessor.getShowCenterX() - mapProcessor.getCutMapWidth() / 2 < 2) {
            leftButton.setEnabled(false);
        }
    }
    SwingUtilities.updateComponentTreeUI(smallMapLabel);// ˢ��ӥ��������
}                                          

private void rightButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
// TODO add your handling code here:    
    getBigMapLabel().setIcon(mapProcessor.moveOfHorizontal(100));// ˢ�µ�ͼ��ʾ��

    if (!leftButton.isEnabled()) {
        leftButton.setEnabled(true);
    } else {
        if (mapProcessor.getMap().getWidth() - mapProcessor.getShowCenterX() - mapProcessor.getCutMapWidth() / 2 < 2) {
            rightButton.setEnabled(false);
        }
    }
    SwingUtilities.updateComponentTreeUI(smallMapLabel);// ˢ��ӥ��������
}                                           

private void revertButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
// TODO add your handling code here:    
    mapProcessor.revert();// ��ԭΪĬ�ϵ��Ӿ�����

    slider.setValue(-250);// ��ԭΪĬ�ϵ����ű���

    // ��������ƶ���ͼ�İ�ť�����ã�������Ϊ����
    if (!upButton.isEnabled()) {
        upButton.setEnabled(true);
    }
    if (!downButton.isEnabled()) {
        downButton.setEnabled(true);
    }
    if (!leftButton.isEnabled()) {
        leftButton.setEnabled(true);
    }
    if (!rightButton.isEnabled()) {
        rightButton.setEnabled(true);
    }
}                                            

private void updateMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                               
// TODO add your handling code here:
    new ManageSignDialog(null, true, "�޸ı��").setVisible(true);// ��ʾ�޸ı�ǶԻ���
}                                              

private void showMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
// TODO add your handling code here:
    new ShowSignDialog(null, true).setVisible(true);// ��ʾ�鿴��Ϣ�Ի���
}                                            

private void deleteMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                               
// TODO add your handling code here:
    int i = JOptionPane.showConfirmDialog(this, "ȷ��Ҫɾ���ñ�ǣ�", "������ʾ",
            JOptionPane.YES_NO_OPTION);// ����ȷ��ɾ����ʾ��

    if (i == 0) {// ȷ��ɾ��

        bigMapLabel.removeSign();// ɾ�����

        SwingUtilities.updateComponentTreeUI(bigMapLabel);// ˢ�µ�ͼ��ʾ��

        dao.deleteClickSign(mapProcessor.getRightClickToMapX(),
                mapProcessor.getRightClickToMapY());// �����ݿ���ɾ��

    }
}                                              

private void bigMapLabelMouseClicked(java.awt.event.MouseEvent evt) {                                         
// TODO add your handling code here:
    if (evt.getButton() == MouseEvent.BUTTON3) {// �鿴�Ƿ����ɵ�������Ҽ�����

        boolean isEnteredSign = true;// Ĭ��Ϊ�ڱ��֮��

        if (getCursor() == Cursor.getDefaultCursor()) {
            isEnteredSign = false;// δ�ڱ��֮��

        }
        // ���ò˵���Ŀ�����
        showMenuItem.setEnabled(isEnteredSign);
        createMenuItem.setEnabled(!isEnteredSign);
        updateMenuItem.setEnabled(isEnteredSign);
        deleteMenuItem.setEnabled(isEnteredSign);
        signPopupMenu.show(bigMapLabel, evt.getX(), evt.getY());// ��ʾ�����˵�

    }
}                                        

private void createMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                               
// TODO add your handling code here:
    if (dao.selectChildSortByFatherId(0).size() == 0) {// ��δ�������

        JOptionPane.showMessageDialog(this, "�������ӱ�����", "������ʾ",
                JOptionPane.INFORMATION_MESSAGE, null);// ������ʾ��

    } else {// �Ѿ��������

        new ManageSignDialog(null, true, "�������").setVisible(true);// ��ʾ������ǶԻ���

    }
}                                              
    private Vector<Vector> searchResult = new Vector<Vector>();

private void simpleButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
// TODO add your handling code here:
    String general = keywordTextField.getText().trim();// ��������ؼ���

    if (general.length() == 0) {// Ϊ����ؼ���

        JOptionPane.showMessageDialog(null, "�����������ؼ��֣�", "������ʾ",
                JOptionPane.INFORMATION_MESSAGE);// ������ʾ��

        return;
    }
    searchResult = dao.selectSimpleSign(general.replace(' ', '%'));// ��ѯ���з��������ı��

    if (searchResult.size() == 0) {// �����ڷ��ϲ�ѯ�����ı��

        JOptionPane.showMessageDialog(null, "û�з��������ı�ǣ�", "������ʾ",
                JOptionPane.INFORMATION_MESSAGE);// ������ʾ��

    } else {// ���ڷ��ϲ�ѯ�����ı��

        final String[] items = new String[searchResult.size()];// ����һ���������

        for (int i = 0; i < items.length; i++) {// �������������ı��

            items[i] = " " + (i + 1) + "��" + searchResult.get(i).get(4);// ��ʼ������

        }
        searchResultList.setModel(new javax.swing.AbstractListModel() {// Ϊ�б�������ģ��

            public int getSize() {
                return items.length;// ����ӵ��ѡ��ĸ���

            }

            public Object getElementAt(int i) {
                return items[i];// ����ָ��ѡ��

            }
        });
    }
}                                            
//    private AdvancedSearchDialog dialog;

private void advancedButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
// TODO add your handling code here:
    new AdvancedSearchDialog(null, true, searchResultList, searchResult).setVisible(true);
}                                              

private void searchResultListValueChanged(javax.swing.event.ListSelectionEvent evt) {                                              
// TODO add your handling code here:
    int selectedIndex = searchResultList.getSelectedIndex();// ���ѡ��������

    Vector sign = searchResult.get(selectedIndex);// ���ѡ��������

    mapProcessor.adjustShowCenter((Integer) sign.get(2), (Integer) sign.get(3));// �����Ӿ�����

    bigMapLabel.setStress((Integer) sign.get(0));// ����Ϊ�����ʾ
    //ˢ�µ�ͼ

    int sliderValue = slider.getValue();// ��õ�ǰ�����ű���

    int scaleValue = mapProcessor.parseScale((Double) sign.get(6));// �����Ҫ�����ű���

    if (sliderValue < scaleValue) {// ��ǰ����С�����ű���

        slider.setValue(scaleValue);
    } else {// ��ǰ������С�����ű���

        slider.setValue(sliderValue + 1);
    }
}                                             

private void keywordTextFieldKeyReleased(java.awt.event.KeyEvent evt) {                                             
// TODO add your handling code here:
    if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
        simpleButtonActionPerformed(null);
    }
}                                            

private void bigMapLabelMouseMoved(java.awt.event.MouseEvent evt) {                                       
// TODO add your handling code here:
    if (!bigMapLabel.isEnteredSign(evt.getX(), evt.getY())) {
        setCursor(Cursor.getDefaultCursor());
    } else {
        setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }
}                                      

    // Variables declaration - do not modify                     
    private javax.swing.JButton addButton;
    private javax.swing.JPanel adjustMapPanel;
    private javax.swing.JButton advancedButton;
    private static com.mwq.map.mwing.BigMapLabel bigMapLabel;
    private javax.swing.JMenuItem createMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JButton downButton;
    private javax.swing.JTextField keywordTextField;
    private javax.swing.JButton leftButton;
    private javax.swing.JPanel leftPanel;
    private javax.swing.JPanel managePanel;
    private javax.swing.JButton manageSortButton;
    private javax.swing.JButton revertButton;
    private javax.swing.JButton rightButton;
    private javax.swing.JPanel rightPanel;
    private javax.swing.JPanel searchButtonPanel;
    private javax.swing.JPanel searchConditionPanel;
    private javax.swing.JPanel searchPanel;
    private javax.swing.JList searchResultList;
    private javax.swing.JScrollPane searchResultScrollPane;
    private javax.swing.JSeparator separator;
    private javax.swing.JButton setMapButton;
    private javax.swing.JMenuItem showMenuItem;
    private javax.swing.JPopupMenu signPopupMenu;
    private javax.swing.JButton simpleButton;
    private javax.swing.JSlider slider;
    private com.mwq.map.mwing.SmallMapLabel smallMapLabel;
    private javax.swing.JButton subButton;
    private javax.swing.JButton upButton;
    private javax.swing.JMenuItem updateMenuItem;
    // End of variables declaration                   

    public static com.mwq.map.mwing.BigMapLabel getBigMapLabel() {
        return bigMapLabel;
    }
}