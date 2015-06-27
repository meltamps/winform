private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Connection con = HSDataBase.getConnection();
        try{
        Statement st=con.createStatement();
        String sql="select * from pamayanan";
        ResultSet rs=st.executeQuery(sql);
        tb.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)
                {
                    System.out.println(e);
                }
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        Connection con = HSDataBase.getConnection();
        try{
        Statement st=con.createStatement();
        String sql="select * from occupants";
        ResultSet rs=st.executeQuery(sql);
        tb.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)
                {
                    System.out.println(e);
                }
    }                     
