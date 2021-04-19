<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

       <section class="information">

                <!-- carousel energies -->
                <div id="carousel_energies" class="carousel slide" data-ride="carousel">
                  <div class="carousel-inner">
                    <div class="carousel-item active">
                        <img src="<%=request.getContextPath()%>/images/air_energy.jpg" class="d-block w-100" alt="air energy">
                        <div class="carousel-caption ">
                          <h1>Забота о природе, долг перед потомками!</h1>
                        </div>
                    </div>
                    <div class="carousel-item">
                      <img src="<%=request.getContextPath()%>/images/sun_energy.jpg" class="d-block w-100" alt="sun energy">
                      <div class="carousel-caption">
                        <h1>Забота о природе, долг перед потомками!</h1>
                      </div>
                    </div>
                    <div class="carousel-item">
                      <img src="<%=request.getContextPath()%>/images/water_energy.jpg" class="d-block w-100" alt="water energy">
                      <div class="carousel-caption">
                        <h1>Забота о природе, долг перед потомками!</h1>
                      </div>
                    </div>
                    <div class="carousel-item">
                      <img src="<%=request.getContextPath()%>/images/land_energy.jpg" class="d-block w-100" alt="land energy">
                      <div class="carousel-caption">
                        <h1>Забота о природе, долг перед потомками!</h1>
                      </div>
                    </div>
                  </div>
                </div>

                <!-- right nav for show on desktop -->
                <div class="d-none d-sm-block position-absolute top-0 end-0">
                  <ul class="nav justify-content-end m-3">
                      <li class="nav-item">
                        <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/nedrousers/">Недропользователи</a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/gkh">ЖКХ</a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/tek">ТЭК</a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/apk">АПК</a>
                      </li>
                      <li class="nav-item">
                        <a class="nav-link" href="<%=request.getContextPath()%>/v/ru/pgs">ПГС</a>
                      </li>
                  </ul>
                </div>
                <!-- /right nav for show on desktop -->

              </section> 