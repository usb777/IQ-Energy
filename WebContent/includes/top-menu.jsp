<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>

        <div class="col-lg-12">
                    <nav class="navbar navbar-expand-lg navbar-light">
                      <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
                        <span class="navbar-toggler-icon"></span>
                      </button>

                      <!-- nav -->
                      <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                          <li class="nav-item">
                            <a class="nav-link active" href="<%=request.getContextPath()%>/company-about">о компании</a>
                          </li>
                          <li class="nav-item">
                            <a class="nav-link" href="<%=request.getContextPath()%>/products">решения и продукты</a>
                          </li>
                          <li class="nav-item">
                            <a class="nav-link" href="#null">Экология</a>
                          </li>

                          <!-- right nav for show on mobile -->
                          <li class="nav-item d-block d-sm-none">
                            <a class="nav-link" href="#">Решение для недропользователей</a>
                          </li>
                          <li class="nav-item d-block d-sm-none">
                            <a class="nav-link" href="#">Решение для ЖКХ</a>
                          </li>
                          <li class="nav-item d-block d-sm-none">
                            <a class="nav-link" href="#">Решение для ТЭК</a>
                          </li>
                          <li class="nav-item d-block d-sm-none">
                            <a class="nav-link" href="#">Решение для АПК</a>
                          </li>
                          <li class="nav-item d-block d-sm-none">
                            <a class="nav-link" href="#">Решение для ГПС</a>
                          </li>
                          <!-- /right nav for show on mobile -->

                        </ul>

                        <!-- Search -->
                        <form class="d-flex">
                          <input class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
                          <button class="btn btn-outline-success" type="submit">Search</button>
                        </form>

                      </div>
                    </nav>
                  </div>   