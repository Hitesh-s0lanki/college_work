using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.UI;
using System.Web.UI.WebControls;

namespace Question1
{
    public partial class converter : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void Button1_Click(object sender, EventArgs e)
        {
            try
            {
                int num = Convert.ToInt32(TextBox1.Text);

                Label1.Text = "Converted Successfully";
            }
            catch (Exception ex) {
                Label1.Text = ex.Message;
            }
        }
    }
}