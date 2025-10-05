<h2>Thêm/Sửa tin tức</h2>
<form action="#" method="post" enctype="multipart/form-data">
    <label>Mã tin:</label>
    <input type="text" name="id" /><br/><br/>

    <label>Tiêu đề:</label>
    <input type="text" name="title" /><br/><br/>

    <label>Nội dung:</label><br/>
    <textarea name="content" rows="5" cols="50"></textarea><br/><br/>

    <label>Hình ảnh:</label>
    <input type="file" name="image" /><br/><br/>

    <label>Tác giả:</label>
    <input type="text" name="author" /><br/><br/>

    <label>Loại tin:</label>
    <select name="categoryId">
        <option value="1">Thời sự</option>
        <option value="2">Thể thao</option>
    </select><br/><br/>

    <button type="submit">Lưu</button>
    <button type="reset">Hủy</button>
</form>
