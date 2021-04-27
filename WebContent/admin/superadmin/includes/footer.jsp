  </div><!-- /#wrapper -->
  
  
      <!-- Logout Modal-->
    <div class="modal fade" id="logoutModal" tabindex="-1" role="dialog" aria-labelledby="logoutModalLabel" aria-hidden="true">
      <div class="modal-dialog" role="document">
        <div class="modal-content">
          <div class="modal-header">
            <h5 class="modal-title" id="logoutModalLabel">Ready to Leave?</h5>
            <button class="close" type="button" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">IQ-ENERGY</span>
            </button>
          </div>
          <div class="modal-body">Select "Logout" below if you are ready to end your current session.</div>
          <div class="modal-footer">
            <button class="btn btn-secondary" type="button" data-dismiss="modal">Cancel</button>
            <%     
            com.iqenergy.util.ServerHelper serverHelper = new com.iqenergy.util.ServerHelper();
               String REAL_SERVER_HOST = serverHelper.getRealServerPath(request);  
               String pathLOGOUT = REAL_SERVER_HOST+"/admin/superadmin/logout.jsp";
             %>
            <a class="btn btn-primary" href=<%=pathLOGOUT %> >Logout</a>
          </div>
        </div>
      </div>
    </div>
  
  <script>
    tinymce.init({
      selector: 'textarea',
      plugins: 'a11ychecker advcode casechange formatpainter linkchecker autolink lists checklist media mediaembed pageembed permanentpen powerpaste table advtable tinycomments tinymcespellchecker',
      toolbar: 'a11ycheck addcomment showcomments casechange checklist code formatpainter pageembed permanentpen table',
      toolbar_mode: 'floating',
      tinycomments_mode: 'embedded',
      tinycomments_author: 'Author name',
   });
  </script>
  

    <!-- JavaScript -->
    <script src="<%=request.getContextPath()%>/admin/superadmin/js/jquery-1.10.2.js"></script>
    <script src="<%=request.getContextPath()%>/admin/superadmin/js/bootstrap.js"></script>
    <!-- Page Specific Plugins -->
    <script src="<%=request.getContextPath()%>/admin/superadmin/js/tablesorter/jquery.tablesorter.js"></script>
    <script src="<%=request.getContextPath()%>/admin/superadmin/js/tablesorter/tables.js"></script>

  </body>
</html>
