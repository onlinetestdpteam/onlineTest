
    <!-- /inner_content_w3_agile_info-->

    <!-- breadcrumbs -->
    <div class="w3l_agileits_breadcrumbs">
        <div class="w3l_agileits_breadcrumbs_inner">
            <ul>
                <li><a href="${request.contextPath}/Admin/">主页</a><span>«</span></li>

                <li>用户管理</li>
            </ul>
        </div>
    </div>
    <!-- //breadcrumbs -->

    <div class="inner_content_w3_agile_info two_in">
        <h2 class="w3_inner_tittle">用户管理</h2>
        <!-- tables -->

        <div class="agile-tables">
            <div class="w3l-table-info agile_info_shadow">
                <h3 class="w3_inner_tittle two">用户列表</h3>
                <table id="table">
                    <thead>
                    <tr>
                        <th>Name</th>
                        <th>Age</th>
                        <th>Gender</th>
                        <th>Height</th>
                        <th>Province</th>
                        <th>Sport</th>
                    </tr>
                    </thead>
                    <tbody>
                    <tr>
                        <td>Jill Smith</td>
                        <td>25</td>
                        <td>Female</td>
                        <td>5'4</td>
                        <td>British Columbia</td>
                        <td>Volleyball</td>
                    </tr>
                    <tr>
                        <td>John Stone</td>
                        <td>30</td>
                        <td>Male</td>
                        <td>5'9</td>
                        <td>Ontario</td>
                        <td>Badminton</td>
                    </tr>
                    <tr>
                        <td>Jane Strip</td>
                        <td>29</td>
                        <td>Female</td>
                        <td>5'6</td>
                        <td>Manitoba</td>
                        <td>Hockey</td>
                    </tr>
                    <tr>
                        <td>Gary Mountain</td>
                        <td>21</td>
                        <td>Male</td>
                        <td>5'8</td>
                        <td>Alberta</td>
                        <td>Curling</td>
                    </tr>
                    <tr>
                        <td>James Camera</td>
                        <td>31</td>
                        <td>Male</td>
                        <td>6'1</td>
                        <td>British Columbia</td>
                        <td>Hiking</td>
                    </tr>
                    </tbody>
                </table>

                <#--<code class="js">-->
                    <#--$('#table').basictable();-->
                <#--</code>-->
            </div>


        </div>
        <!-- //tables -->

        <!-- /social_media-->

    </div>
    <!-- //inner_content_w3_agile_info-->


<script type="text/javascript">
    $(document).ready(function() {
        $('#table').basictable();

        $('#table-breakpoint').basictable({
            breakpoint: 768
        });

        $('#table-swap-axis').basictable({
            swapAxis: true
        });

        $('#table-force-off').basictable({
            forceResponsive: false
        });

        $('#table-no-resize').basictable({
            noResize: true
        });

        $('#table-two-axis').basictable();

        $('#table-max-height').basictable({
            tableWrapper: true
        });
    });
</script>