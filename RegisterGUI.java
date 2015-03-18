/**
 * @author © Kent Nystedt Björknäsgymansiet TE12
 */
import javax.swing.JOptionPane;

public class registerGUI extends javax.swing.JFrame {
    //Member variables and the reference of the model class are defined
    private String type;
    private String sortBy;
    private RegisterMODEL model;
    
    public registerGUI() {
        /*Initializes member variables, the reference of the model class and 
        the graphical user components. As well sets the attribute of some components.
        */
        initComponents();
        model = new RegisterMODEL();
        txaTextscreen.setEditable(false);
        txaSearch.setEditable(false);
        rdbGame.doClick();
        type = "";
        sortBy = null;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        pnlRegister = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        txfSearch = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaSearch = new javax.swing.JTextArea();
        lblImdb = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        lblAuthor = new javax.swing.JLabel();
        lblRating = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txaTextscreen = new javax.swing.JTextArea();
        txfTitle = new javax.swing.JTextField();
        txfAuthor = new javax.swing.JTextField();
        txfRating = new javax.swing.JTextField();
        btnReadFile = new javax.swing.JButton();
        btnChooseFile = new javax.swing.JButton();
        btnAddCsv = new javax.swing.JButton();
        rdbGame = new javax.swing.JRadioButton();
        rdbAlbum = new javax.swing.JRadioButton();
        rdbMovie = new javax.swing.JRadioButton();
        lblSortBy = new javax.swing.JLabel();
        rdbSortByTitel = new javax.swing.JRadioButton();
        rdbSortByAuthor = new javax.swing.JRadioButton();
        rdbSortByRating = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnAddXml = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        cbSelect = new javax.swing.JComboBox();
        btnRemove = new javax.swing.JButton();
        lblDelete = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        txaSearch.setColumns(20);
        txaSearch.setRows(5);
        jScrollPane1.setViewportView(txaSearch);

        lblImdb.setText("Search an title from imdb's api. Only reads single names, like \"Batman\".");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addComponent(lblImdb)
                .addGap(205, 205, 205))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(btnSearch))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblImdb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlRegister.addTab("Search", jPanel5);

        lblTitle.setText("Title:");

        lblAuthor.setText("Author:");

        lblRating.setText("Rating(1-9):");

        txaTextscreen.setColumns(20);
        txaTextscreen.setRows(5);
        jScrollPane2.setViewportView(txaTextscreen);

        btnReadFile.setText("Read File");
        btnReadFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadFileActionPerformed(evt);
            }
        });

        btnChooseFile.setText("Choose File");
        btnChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChooseFileActionPerformed(evt);
            }
        });

        btnAddCsv.setText("Add to CSV");
        btnAddCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCsvActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbGame);
        rdbGame.setText("Game");
        rdbGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbGameActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbAlbum);
        rdbAlbum.setText("Album");
        rdbAlbum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbAlbumActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdbMovie);
        rdbMovie.setText("Movie");
        rdbMovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbMovieActionPerformed(evt);
            }
        });

        lblSortBy.setText("Sort by:                    default sorting: type>title>author>rating");

        buttonGroup2.add(rdbSortByTitel);
        rdbSortByTitel.setText("Titel");
        rdbSortByTitel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSortByTitelActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdbSortByAuthor);
        rdbSortByAuthor.setText("Author");
        rdbSortByAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSortByAuthorActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdbSortByRating);
        rdbSortByRating.setText("Rating");
        rdbSortByRating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbSortByRatingActionPerformed(evt);
            }
        });

        btnAddXml.setText("Add to XML");
        btnAddXml.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddXmlActionPerformed(evt);
            }
        });

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        lblDelete.setText("Delte an item from the library:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSortBy)
                            .addComponent(rdbSortByTitel)
                            .addComponent(rdbSortByAuthor))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblDelete)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(rdbSortByRating)
                                .addGap(134, 134, 134)
                                .addComponent(btnReadFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblAuthor, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblRating))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txfRating, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(btnAddXml)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnChooseFile)))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAddCsv))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(rdbMovie)
                                            .addComponent(rdbAlbum)
                                            .addComponent(rdbGame))
                                        .addGap(0, 4, Short.MAX_VALUE))))
                            .addComponent(jSeparator1)
                            .addComponent(jSeparator2)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(cbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle)
                    .addComponent(txfTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbMovie))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAuthor)
                    .addComponent(txfAuthor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbAlbum))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRating)
                    .addComponent(txfRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rdbGame))
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCsv)
                    .addComponent(btnAddXml)
                    .addComponent(btnChooseFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblSortBy)
                .addGap(7, 7, 7)
                .addComponent(rdbSortByTitel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdbSortByAuthor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbSortByRating)
                    .addComponent(btnReadFile))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDelete)
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(cbSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(165, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        rdbSortByTitel.getAccessibleContext().setAccessibleDescription("");

        pnlRegister.addTab("Register", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlRegister, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//Sets the private variable sortBy to the following strings:
    private void rdbSortByRatingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSortByRatingActionPerformed
        sortBy = "rating";
    }//GEN-LAST:event_rdbSortByRatingActionPerformed

    private void rdbSortByAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSortByAuthorActionPerformed
        sortBy = "author";
    }//GEN-LAST:event_rdbSortByAuthorActionPerformed

    private void rdbSortByTitelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbSortByTitelActionPerformed
        sortBy = "title";
    }//GEN-LAST:event_rdbSortByTitelActionPerformed
//Sets the private variable type to the following strings:
    private void rdbMovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbMovieActionPerformed
        type = "Movie";
    }//GEN-LAST:event_rdbMovieActionPerformed

    private void rdbAlbumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbAlbumActionPerformed
        type = "Album";
    }//GEN-LAST:event_rdbAlbumActionPerformed

    private void rdbGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbGameActionPerformed
        type = "Game";
    }//GEN-LAST:event_rdbGameActionPerformed

    private void btnAddCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCsvActionPerformed
        /*If the filepath isn't selected it's null and then adding an object wont work
        the user gets a message encouraging them to choose a file.
        If the filepath is defined i add the object to that file and refresh the textarea.
        */
        if(model.filePath == null){
            JOptionPane.showMessageDialog(null, "You haven't selected a file!");
        }
        else{
            //Adds an object to an ArrayList and adds it to the file.
            model.addObject(txfTitle.getText(), txfAuthor.getText(), txfRating.getText(), type);
            txaTextscreen.setText("");
            txfTitle.setText("");
            txfAuthor.setText("");
            txfRating.setText("");
            /*Loops the array obj with the objects retrieved from the method "readObjects".
            and outputs them in the textarea and combo box.
            */
            for(MyObject obj : model.readObjects(sortBy)){
                txaTextscreen.append("Title: " + obj.getTitle() + "\n" + "Author: " +
                    obj.getAuthor() + "\n" + "Rating: " + obj.getRating() + "\nType: " +
                    obj.getType() + "\n\n");
                cbSelect.addItem(obj.getTitle());
            }
        }
    }//GEN-LAST:event_btnAddCsvActionPerformed

    private void btnChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChooseFileActionPerformed
        //Runs the method "chooseFile".
        model.chooseFile();
    }//GEN-LAST:event_btnChooseFileActionPerformed

    private void btnReadFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadFileActionPerformed
        /*If the filepath isn't selected it's null and the file wont be read.
        If the filepath is defined i read the objects as arrays and refreshes the textarea
        and the combo box.
        */
        if(model.filePath == null){
            JOptionPane.showMessageDialog(null, "You haven't selected a file!");
        }
        else{
            //Refreshes the combo box by removing the items and then adding the new ones.
            cbSelect.removeAllItems();
            txaTextscreen.setText("");
            /*Loops the array obj with the objects retrieved from the method "readObjects".
            and outputs them in the textarea and combo box.
            */
            for(MyObject obj : model.readObjects(sortBy)){
                txaTextscreen.append("Title: " + obj.getTitle() + "\n" + "Author: " +
                    obj.getAuthor() + "\n" + "Rating: " + obj.getRating() + "\nType: " +
                    obj.getType() + "\n\n");
                cbSelect.addItem(obj.getTitle());
            }
        }
    }//GEN-LAST:event_btnReadFileActionPerformed

    private void btnAddXmlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddXmlActionPerformed
        /*If the filepath isn't selected it's null and the XML object wont be added.
        If the filepath is defined i add the XML object.
        */
        if(model.filePath == null){
            JOptionPane.showMessageDialog(null, "You haven't selected a file!");
        }
        else{
            model.writeXML(txfTitle.getText(), txfAuthor.getText(), txfRating.getText()
                    , type);
            txfTitle.setText("");
            txfAuthor.setText("");
            txfRating.setText("");          
        }
    }//GEN-LAST:event_btnAddXmlActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        /*If the filepath isn't selected it's null and the user can't remove an item.
        If the filepath is defined i remove the item and then refreshes the textarea
        and combo box.
        */
        if(model.filePath == null){
            JOptionPane.showMessageDialog(null, "You haven't selected a file!");
        }
        else{
            model.removeObject((String) cbSelect.getSelectedItem());
            txaTextscreen.setText("");
            cbSelect.removeAllItems();
            /*Loops the array obj with the objects retrieved from the method "readObjects".
            and outputs them in the textarea and combo box.
            */
            for(MyObject obj : model.readObjects(sortBy)){
                txaTextscreen.append("Title: " + obj.getTitle() + "\n" + "Author: " +
                    obj.getAuthor() + "\n" + "Rating: " + obj.getRating() + "\nType: " +
                    obj.getType() + "\n\n");
                cbSelect.addItem(obj.getTitle());
            }
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        //Search the odmbapi for an title matching the on the user entered.
        String xml = model.searchItem(txfSearch.getText());

        //Looks for the index of title, year, director, plot and poster.
        int indexStart = xml.indexOf("title");
        int indexEnd = xml.indexOf("year");
       
        int indexStart2 = xml.indexOf("genre");
        int indexEnd2 = xml.indexOf("director");
        
        int indexStart3 = xml.indexOf("plot");
        int indexEnd3 = xml.indexOf("poster");
        
        //The CharSequence inbetween the indexes.
        CharSequence subSequence = xml.subSequence(indexStart, indexEnd);
        CharSequence subSequence1 = xml.subSequence(indexStart2, indexEnd2);
        CharSequence subSequence2 = xml.subSequence(indexStart3, indexEnd3);
        
        //Outputs the text inbetween the indexes.
        txaSearch.setText((String) subSequence + "\n\n" + subSequence1 + "\n\n" + subSequence2);
        
    }//GEN-LAST:event_btnSearchActionPerformed
    
    /**The main method.
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCsv;
    private javax.swing.JButton btnAddXml;
    private javax.swing.JButton btnChooseFile;
    private javax.swing.JButton btnReadFile;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox cbSelect;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblAuthor;
    private javax.swing.JLabel lblDelete;
    private javax.swing.JLabel lblImdb;
    private javax.swing.JLabel lblRating;
    private javax.swing.JLabel lblSortBy;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTabbedPane pnlRegister;
    private javax.swing.JRadioButton rdbAlbum;
    private javax.swing.JRadioButton rdbGame;
    private javax.swing.JRadioButton rdbMovie;
    private javax.swing.JRadioButton rdbSortByAuthor;
    private javax.swing.JRadioButton rdbSortByRating;
    private javax.swing.JRadioButton rdbSortByTitel;
    private javax.swing.JTextArea txaSearch;
    private javax.swing.JTextArea txaTextscreen;
    private javax.swing.JTextField txfAuthor;
    private javax.swing.JTextField txfRating;
    private javax.swing.JTextField txfSearch;
    private javax.swing.JTextField txfTitle;
    // End of variables declaration//GEN-END:variables
}
