package com.example.banking.data.respositoriesImpl

import com.example.banking.data.model.PopularPerson
import com.example.banking.data.model.Transaction
import com.example.banking.domain.AppRepo
import kotlinx.coroutines.flow.Flow

class AppImpl: AppRepo {
     override  fun getPopulars():ArrayList<PopularPerson> {

        val dataList= ArrayList<PopularPerson>()
        dataList.add(PopularPerson(image="https://images.ctfassets.net/h6goo9gw1hh6/2sNZtFAWOdP1lmQ33VwRN3/24e953b920a9cd0ff2e1d587742a2472/1-intro-photo-final.jpg?w=1200&h=992&fl=progressive&q=70&fm=jpg", name = "Gustav"))
        dataList.add(PopularPerson(image="https://img.freepik.com/free-photo/portrait-man-laughing_23-2148859448.jpg?size=338&ext=jpg&ga=GA1.1.2008272138.1725580800&semt=ais_hybrid", name = "Brian"))
        dataList.add(PopularPerson(image="https://www.perfocal.com/blog/content/images/size/w960/2021/01/Perfocal_17-11-2019_TYWFAQ_100_standard-3.jpg", name = "Natalya"))
        dataList.add(PopularPerson(image="https://media.istockphoto.com/id/1320811419/photo/head-shot-portrait-of-confident-successful-smiling-indian-businesswoman.jpg?s=612x612&w=0&k=20&c=bCUTB8vd8MnzZFIq-x645-SmLNk2sQzOvOvWCPGDfZ4=", name = "Jarvis"))
        dataList.add(PopularPerson(image="https://t4.ftcdn.net/jpg/03/64/21/11/360_F_364211147_1qgLVxv1Tcq0Ohz3FawUfrtONzz8nq3e.jpg", name = "Quiche"))
        dataList.add(PopularPerson(image="https://www.corporatephotographerslondon.com/wp-content/uploads/2021/06/non-smiling-LinkedIn-profile-photo.jpg", name = "Baa"))

        return  dataList
    }

    override fun getTransactions(): ArrayList<Transaction> {

        val dataList= ArrayList<Transaction>()
        dataList.add(Transaction(imageUrl = "https://images.ctfassets.net/h6goo9gw1hh6/2sNZtFAWOdP1lmQ33VwRN3/24e953b920a9cd0ff2e1d587742a2472/1-intro-photo-final.jpg?w=1200&h=992&fl=progressive&q=70&fm=jpg",name="Natalya Undergrowth",date="Today at 12:15 am",amount="+$102.32", isDebit = true))
        dataList.add(Transaction(imageUrl = "https://img.freepik.com/free-photo/portrait-man-laughing_23-2148859448.jpg?size=338&ext=jpg&ga=GA1.1.2008272138.1725580800&semt=ais_hybrid",name="Norman Gordon",date="Yesterday at 12:45 am",amount="-$324.32", isDebit = false))
        dataList.add(Transaction(imageUrl = "https://www.perfocal.com/blog/content/images/size/w960/2021/01/Perfocal_17-11-2019_TYWFAQ_100_standard-3.jpg",name="Sir Cumference",date="Yesterday at 12:45 am",amount="+563.32",isDebit = true))
        dataList.add(Transaction(imageUrl = "https://t4.ftcdn.net/jpg/03/64/21/11/360_F_364211147_1qgLVxv1Tcq0Ohz3FawUfrtONzz8nq3e.jpg",name="Gustav Purpleson",date="Yesterday at 12:45 am",amount="-$143.54", isDebit = false))


        return dataList
    }
}