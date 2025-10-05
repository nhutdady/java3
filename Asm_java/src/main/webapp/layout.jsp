<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Báo Điện Tử</title>
    <link rel="stylesheet" href="css/style.css"/>
    <style>
        body { margin: 0; font-family: Arial, sans-serif; }
        header, footer { background: #4A90E2; color: white; text-align: center; padding: 15px; }
        nav { background: #f2f2f2; padding: 10px; text-align: center; }
        nav a { margin: 0 10px; text-decoration: none; color: #333; }
        .container { display: flex; min-height: 400px; }
        .main { flex: 3; padding: 20px; background: #fff; }
        .sidebar { flex: 1; padding: 10px; background: #fafafa; }
        .box { margin-bottom: 15px; padding: 10px; }
        .popular { background: #f5a623; color: #fff; }
        .latest { background: #9b9b9b; color: #fff; }
        .viewed { background: #7ed321; color: #fff; }
        .newsletter { background: #eee; }
    </style>
</head>
<body>
    <!-- Header -->
    <header>
        <h1>Báo Điện Tử</h1>
    </header>

    <!-- Menu -->
    <nav>
        <a href="home.jsp">Trang chủ</a>
        <a href="#">Văn hóa</a>
        <a href="#">Pháp luật</a>
        <a href="#">Thể thao</a>
        <a href="#">...</a>
    </nav>

    <!-- Content -->
    <div class="container">
        <!-- Nội dung thay đổi theo trang -->
        <div class="main">
            <jsp:include page="${content}" />
        </div>

        <!-- Sidebar -->
        <div class="sidebar">
            <div class="box popular">
                <h3>5 bản tin được xem nhiều</h3>
            </div>
            <div class="box latest">
                <h3>5 bản tin mới nhất</h3>
            </div>
            <div class="box viewed">
                <h3>5 bản tin đã xem</h3>
            </div>
            <div class="box newsletter">
                <h3>Newsletter</h3>
                <form>
                    <input type="email" placeholder="Nhập email" style="width: 100%; padding:5px;"/>
                    <button type="submit" style="margin-top:5px; width:100%;">Đăng ký</button>
                </form>
            </div>
        </div>
    </div>

    <!-- Footer -->
    <footer>
        <p>&copy; 2025 Báo Điện Tử - Thiết kế tự do</p>
    </footer>
</body>
</html>
